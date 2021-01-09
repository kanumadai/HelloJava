package com.kunuma.decorater;

public class Bacon extends Garnish{

	public Bacon(FastFood fastFood) {
		super(fastFood, 1.5f, "Bacon");
		// TODO Auto-generated constructor stub
	}
	
	public Bacon(FastFood fastFood,int numb) {
		super(fastFood, 1.5f*numb, numb+"Bacon");
		// TODO Auto-generated constructor stub
	}
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return getPrice() + getFastFood().cost();
	}

}
