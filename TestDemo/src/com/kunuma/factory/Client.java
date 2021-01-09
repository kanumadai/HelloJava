package com.kunuma.factory;

public class Client{
	public static void main(String[] args) {
		
		CoffeeStore coffeeStore = new CoffeeStore();
		
		coffeeStore.setFactory(new AmericanCoffeeFactory());
		
		Coffee coffee =coffeeStore.orderCoffee();
		
		System.out.println(coffee.getName());
	}
}