package com.example.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import org.apache.kafka.clients.admin.NewTopic;

/*
 * The @Configuration annotation here ensures that the
 * topics exist or are created at application start-up.
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createStringTopic() {
        return TopicBuilder.name("myTopic")
                .build();
    }

    @Bean
    public NewTopic createJsonTopic() {
        return TopicBuilder.name("myJsonTopic")
                .build();
    }
}