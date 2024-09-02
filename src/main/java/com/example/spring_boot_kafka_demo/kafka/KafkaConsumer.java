package com.example.spring_boot_kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    @KafkaListener(topics= "myTopic", groupId = "myGroup")
    public void consume(String message){

    }
}
