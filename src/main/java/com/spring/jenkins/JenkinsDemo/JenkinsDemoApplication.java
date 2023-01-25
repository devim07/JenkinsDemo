package com.spring.jenkins.JenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	public static Logger LOGGER=LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		LOGGER.info("JenkinsDemoApplication started");
	}

	public static void main(String[] args) {
		LOGGER.info("JenkinsDemoApplication executing...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
