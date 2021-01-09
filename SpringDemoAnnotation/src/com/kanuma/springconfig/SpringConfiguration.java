package com.kanuma.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import config.JdbcConfig;

@Configuration
@ComponentScan({"com.kanuma"})
@Import({JdbcConfig.class})
@PropertySource("classpath:config/Jdbc.properties")
public class SpringConfiguration {

	@Bean
	public static PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}