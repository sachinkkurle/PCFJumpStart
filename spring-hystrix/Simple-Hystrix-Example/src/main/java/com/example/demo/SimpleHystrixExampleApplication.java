package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableCircuitBreaker
@SpringBootApplication
public class SimpleHystrixExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleHystrixExampleApplication.class, args);
	}
}
