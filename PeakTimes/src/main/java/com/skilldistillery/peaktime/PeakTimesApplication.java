package com.skilldistillery.peaktime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
public class PeakTimesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeakTimesApplication.class, args);
	}

}
