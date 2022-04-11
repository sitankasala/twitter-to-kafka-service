package com.microservices.twitter.to.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Data
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToConfigDataConfig {
    List<String> twitterKeyWords;
}
