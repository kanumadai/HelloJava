package com.kunuma.factory;

public class CoffeeStore {

	private CoffeeFactory factory;
	
	public void setFactory(CoffeeFactory factory) {
		this.factory = factory;
	}
	public Coffee orderCoffee() {	
		Coffee coffee=factory.createCoffee();
		coffee.addSuger();
		return 	coffee;
	}
}
