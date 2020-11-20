package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
         private static final String REST_URL="https://www.equifax.com/getScore";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
