package com.kunuma.mediator;

public class Client {
	public static void main(String[] args) {
		MediatorStructure mediator = new MediatorStructure();
		Tenant tenant = new Tenant("Allen", mediator);
		Ower ower = new Ower("HouseOwer", mediator);
		
		mediator.setOwer(ower);
		mediator.setTenant(tenant);
		
		tenant.constact("I want to rent a house!");
		ower.constact("I have a house ,do you want rent?");
	}
}