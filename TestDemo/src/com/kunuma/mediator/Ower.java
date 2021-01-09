package com.kunuma.mediator;

public class Ower extends Person{

	public Ower(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	public void constact(String msg) {
		mediator.constact(msg, this);
	}
	public void getMessage(String msg) {
		System.out.println("Ower "+name +" get the message is:"+msg);
	}
	
}
