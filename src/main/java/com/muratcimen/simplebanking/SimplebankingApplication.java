package com.muratcimen.simplebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.muratcimen.*")
public class SimplebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplebankingApplication.class, args);
	}

}
