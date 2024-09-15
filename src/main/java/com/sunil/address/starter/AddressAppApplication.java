package com.sunil.address.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.sunil.*")
@EnableAutoConfiguration
public class AddressAppApplication extends SpringBootServletInitializer
{
	
	private static final Logger logger = LoggerFactory.getLogger(AddressAppApplication.class);

	public static void main(String[] args) 
	{
		logger.info("Address Application is starting");
		SpringApplication.run(AddressAppApplication.class, args);
		logger.info("Address Application is started");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		logger.info("------------------------");
		return application.sources(AddressAppApplication.class);
	}

}
