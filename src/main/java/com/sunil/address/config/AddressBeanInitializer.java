/*
*
*N Sunil 
*
*/

package com.sunil.address.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AddressBeanInitializer
{
	
	private static final Logger log = LoggerFactory.getLogger(AddressBeanInitializer.class);
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		log.info("initializing RestTemplate");
		return new RestTemplate();
	}
}
