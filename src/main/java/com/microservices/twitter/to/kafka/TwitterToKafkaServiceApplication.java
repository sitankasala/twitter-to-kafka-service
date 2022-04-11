package com.microservices.twitter.to.kafka;

import com.microservices.twitter.to.kafka.config.TwitterToConfigDataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.Arrays;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

	@Autowired
	TwitterToConfigDataConfig twitterToConfigDataConfig;
	public static void main(String[] args) {
		SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("The events in twitter are " + Arrays.toString(twitterToConfigDataConfig.getTwitterKeyWords().toArray(new String[]{})));
	}

//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//		System.out.println("event data is " + event.getSource());
//		System.out.println("The events in twitter are " + Arrays.toString(twitterToConfigDataConfig.getTwitterKeyWords().toArray(new String[]{})));
//	}
}
