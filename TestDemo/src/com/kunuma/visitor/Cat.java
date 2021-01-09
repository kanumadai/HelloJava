package com.kunuma.visitor;

public class Cat implements Animal{

	@Override
	public void accept(Person person) {
		// TODO Auto-generated method stub
		person.feed(this);
		System.out.println("Cat get the food from "+ person.getName());
	}

}
