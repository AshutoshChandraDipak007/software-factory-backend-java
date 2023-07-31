package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringbootProjectForStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectForStudyApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
