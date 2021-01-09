package com.kunuma.visitor;


public interface Person {
	
	void feed(Cat cat);
	
	void feed(Dog dog);
	
	public String getName();
}
