package com.kunuma.factory;

public class AmericanCoffeeFactory implements CoffeeFactory{

	@Override
	public Coffee createCoffee() {
		// TODO Auto-generated method stub
		return new AmericanCoffee();
	}

}
