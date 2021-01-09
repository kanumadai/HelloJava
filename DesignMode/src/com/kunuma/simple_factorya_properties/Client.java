package com.kunuma.simple_factorya_properties;

public class Client{
	public static void main(String[] args) {
		

		
		Coffee coffee =CoffeeFactory.createCoffee("american");
		
		System.out.println(coffee.getName());
	}
}