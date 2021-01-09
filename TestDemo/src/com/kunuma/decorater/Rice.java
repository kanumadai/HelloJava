package com.kunuma.decorater;

public class Rice extends FastFood {

	public Rice() {
		super(10, "Rice");
		// TODO Auto-generated constructor stub
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return getPrice();
	}

}
