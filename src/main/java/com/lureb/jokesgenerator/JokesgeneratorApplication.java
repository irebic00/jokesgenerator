package com.lureb.jokesgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {})
public class JokesgeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesgeneratorApplication.class, args);
	}

}
