package com.kunuma.command;
public class Client{
	public static void main(String[] args) {
		Order order = new Order();
		
		order.setDiningTable(1);
		order.setFood("beer", 3);
		order.setFood("pizza", 3);
		order.setFood("humberger", 3);

		Order order1 = new Order();
		
		order1.setDiningTable(2);
		order1.setFood("rice", 2);
		order1.setFood("cola", 1);
		order1.setFood("meat", 2);
		
		SeniorChef receiver = new SeniorChef();
		OrderCommand orderCommand1 = new OrderCommand(receiver, order);
		OrderCommand orderCommand2 = new OrderCommand(receiver, order1);
		
		Waitor waitor = new Waitor();
		waitor.setCommand(orderCommand1);
		waitor.setCommand(orderCommand2);
		waitor.orderUp();
		
	}
}