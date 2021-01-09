package com.kunuma.decorater;

public abstract class Garnish extends FastFood{

	private FastFood fastFood;

	public FastFood getFastFood() {
		return fastFood;
	}
	public void setFastFood(FastFood fastFood) {
		this.fastFood = fastFood;
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return fastFood.getDesc()+"+"+super.getDesc();
	}
	public Garnish(FastFood fastFood, float price, String desc) {
		super(price, desc);
		this.fastFood = fastFood;
		// TODO Auto-generated constructor stub
	}
}
