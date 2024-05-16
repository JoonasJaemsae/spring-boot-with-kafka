package com.example.kafka.consumer;

import com.example.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "myJsonTopic", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received by JsonKafkaConsumer: %s", user.toString()));

    }

}
