package com.farhat.steven.InternationalSpaceStation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class InternationalSpaceStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternationalSpaceStationApplication.class, args);
	}

}
