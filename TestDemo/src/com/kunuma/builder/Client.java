package com.kunuma.builder;
public class Client{
	public static void main(String[] args) {
		Phone phone = new Phone.Builder()
				.cpu("AMD")
				.mainboard("Acer")
				.screen("sasumg")
				.build();
		
		System.out.println(phone);
	}
}