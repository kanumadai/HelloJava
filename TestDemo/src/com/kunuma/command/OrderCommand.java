package com.kunuma.command;

import java.util.Map;
import java.util.Set;

public class OrderCommand extends Command{

	private SeniorChef receiver;
	private Order order;
	
	public OrderCommand(SeniorChef receiver, Order order) {
		super();
		this.receiver = receiver;
		this.order = order;
	}

	public SeniorChef getReceiver() {
		return receiver;
	}

	public void setReceiver(SeniorChef receiver) {
		this.receiver = receiver;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		System.out.println("Table:"+order.getDiningTable());
		
		Map<String, Integer> foodDirMap = order.getFoodDirMap();
		
		Set<String> keys = foodDirMap.keySet();
		for(String foodName: keys) {
			receiver.makeFood(foodName, foodDirMap.get(foodName));
		}
		System.out.println("Table:"+order.getDiningTable() +"'s food is OK.");
	}

}
