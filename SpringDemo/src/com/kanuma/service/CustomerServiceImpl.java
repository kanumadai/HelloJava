package com.kanuma.service;

import java.util.Date;

public class CustomerServiceImpl implements CustomerService{
	
	private String driver;
	private int port;
	private Date today;
	
	
    public CustomerServiceImpl(String driver, int port, Date today) {
		super();
		this.driver = driver;
		this.port = port;
		this.today = today;
	}


	@Override
    public void add() {
        System.out.println(driver+port+today.toString());
    }
}
