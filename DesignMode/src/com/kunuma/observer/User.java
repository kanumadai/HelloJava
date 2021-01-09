package com.kunuma.observer;

public class User implements Observer{

	private String name;
	
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void update(String updateMsg) {
		// TODO Auto-generated method stub
		System.out.println(name +":"+updateMsg );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
