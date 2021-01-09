package com.kunuma.flyweight;

public abstract class AbstractBox {

	public abstract String getShape();

	public void display(String color) {
		System.out.println("Shape:" + getShape() + "---" + "Color:" + color);
	}
}
