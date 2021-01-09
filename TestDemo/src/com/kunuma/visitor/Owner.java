package com.kunuma.visitor;

public class Owner implements Person{

	private String name = "Owner";
	@Override
	public void feed(Cat cat) {
		// TODO Auto-generated method stub
		System.out.println(name +"feed the cat.");
	}

	@Override
	public void feed(Dog dog) {
		// TODO Auto-generated method stub
		System.out.println(name +"feed the dog.");
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
