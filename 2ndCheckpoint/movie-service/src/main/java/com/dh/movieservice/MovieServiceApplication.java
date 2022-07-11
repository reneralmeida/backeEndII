package com.dh.movieservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@EnableRabbit
@SpringBootApplication
public class MovieServiceApplication {

	public static void main (String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
}
