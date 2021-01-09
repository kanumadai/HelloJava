package com.kunuma.mediator;

public class Tenant extends Person{

	public Tenant(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void constact(String msg) {
		mediator.constact(msg, this);		
	}

	public void getMessage(String msg) {
		System.out.println("Tenant "+name+" get the message is:"+msg);
	}
}
