package ru.dementev.mongoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class MongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoServiceApplication.class, args);
	}

}
