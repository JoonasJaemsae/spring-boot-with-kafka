package com.example.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    // Whenever a producer sends a message to the topic,
    // consumer will receive and display it.
    // groupId is the same as in application.properties
    // If this Listener is sent a JSON object, it will result in an error while running the app.
    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received by Consumer: %s", message));
    }
}
