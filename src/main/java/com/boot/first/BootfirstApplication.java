package com.boot.first;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class BootfirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootfirstApplication.class, args);

	}
}
