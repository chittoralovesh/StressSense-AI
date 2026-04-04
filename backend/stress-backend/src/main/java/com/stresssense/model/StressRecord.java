package com.stresssense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StressRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;   // 🔥 ADD THIS

    private double snoringRate;
    private double respirationRate;
    private double bodyTemperature;
    private int limbMovement;
    private int bloodOxygen;
    private int eyeMovement;
    private int sleepingHours;
    private int heartRate;

    private double predictedStress;

    public StressRecord(){}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Long getId() { return id; }

    public double getSnoringRate() { return snoringRate; }
    public void setSnoringRate(double snoringRate) { this.snoringRate = snoringRate; }

    public double getRespirationRate() { return respirationRate; }
    public void setRespirationRate(double respirationRate) { this.respirationRate = respirationRate; }

    public double getBodyTemperature() { return bodyTemperature; }
    public void setBodyTemperature(double bodyTemperature) { this.bodyTemperature = bodyTemperature; }

    public int getLimbMovement() { return limbMovement; }
    public void setLimbMovement(int limbMovement) { this.limbMovement = limbMovement; }

    public int getBloodOxygen() { return bloodOxygen; }
    public void setBloodOxygen(int bloodOxygen) { this.bloodOxygen = bloodOxygen; }

    public int getEyeMovement() { return eyeMovement; }
    public void setEyeMovement(int eyeMovement) { this.eyeMovement = eyeMovement; }

    public int getSleepingHours() { return sleepingHours; }
    public void setSleepingHours(int sleepingHours) { this.sleepingHours = sleepingHours; }

    public int getHeartRate() { return heartRate; }
    public void setHeartRate(int heartRate) { this.heartRate = heartRate; }

    public double getPredictedStress() { return predictedStress; }
    public void setPredictedStress(double predictedStress) { this.predictedStress = predictedStress; }
}