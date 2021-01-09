package com.kanuma.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanuma.service.CustomerService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
	
		CustomerService cs= (CustomerService) aContext.getBean("customerService");
		cs.add();
		//System.out.println(cs.);
	}
}
