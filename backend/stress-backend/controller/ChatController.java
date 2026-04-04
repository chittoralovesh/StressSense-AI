package com.stresssense.controller;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin("*")
public class ChatController {

    String OPENAI_API_KEY = System.getenv("OPENAI_API_KEY");

    @PostMapping
    public Map chat(@RequestBody Map<String, String> body) {

        String userMessage = body.get("message");

        String url = "https://api.openai.com/v1/chat/completions";

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(OPENAI_API_KEY);

        String requestBody = """
        {
          "model": "gpt-4o-mini",
          "messages": [
            {"role": "system", "content": "You are an AI mental health assistant helping users manage stress."},
            {"role": "user", "content": "%s"}
          ]
        }
        """.formatted(userMessage);

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<Map> response =
                restTemplate.postForEntity(url, entity, Map.class);

        return response.getBody();
    }
}