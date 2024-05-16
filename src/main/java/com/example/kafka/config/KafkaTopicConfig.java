package com.example.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import org.apache.kafka.clients.admin.NewTopic;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic testTopic() {
        return TopicBuilder.name("myTopic")
                .build();
    }

    @Bean
    public NewTopic testJsonTopic() {
        return TopicBuilder.name("myJsonTopic")
                .build();
    }
}