package com.kunuma.decorater;

public class Noodle extends FastFood {

	public Noodle() {
		super(8, "Noodle");
		// TODO Auto-generated constructor stub
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return getPrice();
	}

}
