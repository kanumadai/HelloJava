package com.kunuma.observer;
public class Client{
	public static void main(String[] args) {
		
		SubscriptionSubject subject = new SubscriptionSubject();
		
		subject.attach(new User("Allen"));
		subject.attach(new User("Amy"));
		subject.attach(new User("Gily"));
		
		subject.notify("I love you!!!");
		
	}
	
	
}