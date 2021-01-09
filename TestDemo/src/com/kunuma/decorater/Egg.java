package com.kunuma.decorater;

public class Egg extends Garnish{

	public Egg(FastFood fastFood) {
		super(fastFood, 1, "Egg");
		// TODO Auto-generated constructor stub
	}

	public Egg(FastFood fastFood, int numb) {
		super(fastFood, 1*numb, numb+"Egg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return getPrice() + getFastFood().cost();
	}

}
