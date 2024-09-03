package com.example.spring_boot_kafka_demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.spring_boot_kafka_demo.model.User;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);


    @KafkaListener(topics = "myTopic_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message received->  %s ", user.toString()));
    }
}


// For first time after sending message in topic, logger for message sent does not show up only received is there if both consumer
//  and poducer are configured, If sent again through postman then  it is both message sent and received loggers
