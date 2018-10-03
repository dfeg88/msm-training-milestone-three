package com.moneysupermarket.milestonethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MilestoneThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilestoneThreeApplication.class, args);
	}
}
