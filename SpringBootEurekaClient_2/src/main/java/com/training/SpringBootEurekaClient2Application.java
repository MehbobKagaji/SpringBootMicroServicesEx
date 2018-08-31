package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClient2Application.class, args);
	}
}
