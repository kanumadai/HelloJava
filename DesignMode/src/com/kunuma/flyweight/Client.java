package com.kunuma.flyweight;

public class Client{
	public static void main(String[] args) {
		AbstractBox box1 = BoxFactory.getInstance().getShape("I");
		box1.display("red");
		AbstractBox box2 = BoxFactory.getInstance().getShape("J");
		box2.display("green");
		AbstractBox box3 = BoxFactory.getInstance().getShape("L");
		box3.display("gray");
		AbstractBox box4 = BoxFactory.getInstance().getShape("S");
		box4.display("blue");
		AbstractBox box5 = BoxFactory.getInstance().getShape("O");
		box5.display("yellow");
		AbstractBox box6 = BoxFactory.getInstance().getShape("T");
		box6.display("yellow");
		AbstractBox box7 = BoxFactory.getInstance().getShape("Z");
		box7.display("pink");
	}
}