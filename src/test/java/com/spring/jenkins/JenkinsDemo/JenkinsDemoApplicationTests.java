package com.spring.jenkins.JenkinsDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {
	
	public static Logger LOGGER=LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("JenkinsDemoApplicationTests Test executing");
		assertEquals(true, true);
	}

}
