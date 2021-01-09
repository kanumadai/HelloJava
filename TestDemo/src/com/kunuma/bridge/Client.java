package com.kunuma.bridge;
public class Client{
	public static void main(String[] args) {
		OperatingSystem system = new MacSystem(new AviFile());
		
		system.play("Brave heart.");
		
		system= new WindowsSystem(new RmvbFile());
		system.play("I can't love you more.");
	}
}