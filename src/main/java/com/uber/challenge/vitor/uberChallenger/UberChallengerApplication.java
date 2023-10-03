package com.uber.challenge.vitor.uberChallenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UberChallengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberChallengerApplication.class, args);
	}

}
