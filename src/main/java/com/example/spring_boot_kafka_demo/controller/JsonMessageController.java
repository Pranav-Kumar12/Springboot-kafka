package com.example.spring_boot_kafka_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_kafka_demo.kafka.JsonKafkaProducer;
import com.example.spring_boot_kafka_demo.model.User;

@RestController
@RequestMapping("api/v2/kafka")
public class JsonMessageController {
    
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer){
        this.kafkaProducer= kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok(" Json Message sent to kafka topic ");
    }
    
}
