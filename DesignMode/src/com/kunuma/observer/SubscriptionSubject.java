package com.kunuma.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{

	private List<Observer> userList = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		userList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		userList.remove(observer);
	}

	@Override
	public void notify(String updateMsg) {
		// TODO Auto-generated method stub
		for(Observer observer:userList) {
			observer.update(updateMsg);
		}
	}

}
