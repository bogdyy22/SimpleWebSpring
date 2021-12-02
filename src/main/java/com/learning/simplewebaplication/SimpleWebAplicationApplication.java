package com.learning.simplewebaplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SimpleWebAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAplicationApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beansNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beansNames);
			for (String beanName : beansNames){
				System.out.println(beanName);
			}
		};
	}
}
