package com.kanuma.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import config.JdbcConfig;

@Configuration		//spring configuration
@ComponentScan({"com.kanuma"})		//set contain's component scan scope 
@Import({JdbcConfig.class})			//other configuration class
@PropertySource("classpath:config/Jdbc.properties") 	//config file
@EnableAspectJAutoProxy				//enable anunce log proxied by spring		
public class SpringConfiguration {

	@Bean	//return value is inserted into spring container
	public static PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}