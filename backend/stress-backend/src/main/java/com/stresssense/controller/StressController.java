package com.stresssense.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.stresssense.model.StressRecord;
import com.stresssense.service.StressService;

@RestController
@RequestMapping("/api/stress")
@CrossOrigin("*")
public class StressController {

    private final StressService service;

    public StressController(StressService service) {
        this.service = service;
    }

    // ==========================
    // 📜 GET HISTORY
    // ==========================
    @GetMapping("/history")
    public List<StressRecord> getHistory(@RequestParam String email){
        return service.getRecordsByEmail(email);
    }

    // ==========================
    // 🤖 PREDICT STRESS
    // ==========================
    @PostMapping("/predict")
    public Map<String, Object> predictStress(@RequestBody Map<String, Object> data) {

        String url = "http://127.0.0.1:5001/predict";
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> response;

        try {
            response = restTemplate.postForObject(url, data, Map.class);
        } catch (Exception e) {
            return Map.of("error", "Flask server not running");
        }

        // ==========================
        // 🧠 INPUT VALUES
        // ==========================
        double snoring = getDouble(data, "snoringRate");
        double respiration = getDouble(data, "respirationRate");
        double temp = getDouble(data, "bodyTemperature");

        int limb = (int) getDouble(data, "limbMovement");
        int oxygen = (int) getDouble(data, "bloodOxygen");
        int eye = (int) getDouble(data, "eyeMovement");
        int sleep = (int) getDouble(data, "sleepingHours");
        int heart = (int) getDouble(data, "heartRate");

        // ==========================
        // 💾 SAVE RECORD
        // ==========================
        StressRecord record = new StressRecord();

        // 🔥 IMPORTANT FIX
        record.setEmail((String) data.get("email"));

        record.setSnoringRate(snoring);
        record.setRespirationRate(respiration);
        record.setBodyTemperature(temp);
        record.setLimbMovement(limb);
        record.setBloodOxygen(oxygen);
        record.setEyeMovement(eye);
        record.setSleepingHours(sleep);
        record.setHeartRate(heart);

        // ==========================
        // 📊 ML OUTPUT
        // ==========================
        double rf = getDouble(response, "random_forest");
        double nn = getDouble(response, "neural_network");

        // ==========================
        // 🎯 FIXED STRESS LOGIC
        // ==========================
        double avg = (rf + nn) / 2.0;

        double percent = avg * 50 + 25;

        // Clamp 0–100
        percent = Math.max(0, Math.min(100, percent));         // HIGH

        record.setPredictedStress(percent);

        service.saveRecord(record);

        return Map.of(
                "predictedStress", percent,
                "random_forest", rf,
                "neural_network", nn
        );
    }

    // ==========================
    // 🛡 SAFE PARSER
    // ==========================
    private double getDouble(Map<String, Object> map, String key) {
        try {
            Object val = map.get(key);
            if (val == null) return 0;
            return ((Number) val).doubleValue();
        } catch (Exception e) {
            return 0;
        }
    }
}