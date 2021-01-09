package com.kunuma.decorater;

public class Client{
	
	public static void main(String[] args) {
		FastFood food = new Rice();
		System.out.println(food.getDesc()+":"+ food.cost());
		
		food = new Egg(food,3);		
		System.out.println(food.getDesc() + ":" + food.cost());
		
		food = new Bacon(food);		
		System.out.println(food.getDesc() + ":" + food.cost());

		food = new Bacon(food,2);		
		System.out.println(food.getDesc() + ":" + food.cost());
	}
}