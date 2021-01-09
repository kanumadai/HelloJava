package com.kunuma.mediator;

public class MediatorStructure extends Mediator{

	private Ower ower;
	private Tenant tenant;
	
	@Override
	public void constact(String msg, Person person) {
		// TODO Auto-generated method stub
		if(person == ower) {
			tenant.getMessage(msg);
		}
		else {
			ower.getMessage(msg);
		}
	}

	public Ower getOwer() {
		return ower;
	}

	public void setOwer(Ower ower) {
		this.ower = ower;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	
	
}
