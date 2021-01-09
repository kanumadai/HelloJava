package com.kunuma.decorater;

public abstract class FastFood {

	private float price;
	private String desc;

	public FastFood(float price,String desc){
		this.setDesc(desc);
		this.setPrice(price);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public abstract float cost() ;
}
