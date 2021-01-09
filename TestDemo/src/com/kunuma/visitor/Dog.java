package com.kunuma.visitor;

public class Dog implements Animal{

	@Override
	public void accept(Person person) {
		// TODO Auto-generated method stub
		person.feed(this);
		System.out.println("Dog get the food from "+ person.getName());
	}

}
