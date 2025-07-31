package com.nullifidianz.java_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JavaAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAuthApplication.class, args);
	}

}
