package com.spring.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.apache.log4j.Logger;


@SpringBootApplication
@EnableSwagger2
public class SpringdemoApplication {

	final static Logger logger = Logger.getLogger(SpringdemoApplication.class);
	
	public static void main(String[] args) {
		
		 logger.info("Entering the main method");
		// logger.warn("Inserting to stub; this does NOT persist the item"); 

		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
