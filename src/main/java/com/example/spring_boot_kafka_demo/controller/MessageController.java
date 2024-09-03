package com.example.spring_boot_kafka_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_kafka_demo.kafka.KafkaProducer;


@RestController
@RequestMapping("/api/v1/kafka")   // this is base url
public class MessageController{

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer= kafkaProducer;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    // http:localhost:8080/api/v1/kafka/publish?message=tada
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

    
}