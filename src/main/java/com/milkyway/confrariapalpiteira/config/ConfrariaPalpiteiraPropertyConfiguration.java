package com.milkyway.confrariapalpiteira.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import com.milkyway.confrariapalpiteira.config.data.ConfrariaPalpiteiraConfig;


@Configuration
@EnableConfigurationProperties(ConfrariaPalpiteiraConfig.class)
@PropertySource("application.properties")
public class ConfrariaPalpiteiraPropertyConfiguration {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
