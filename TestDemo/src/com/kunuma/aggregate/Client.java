package com.kunuma.aggregate;
public class Client {
	public static void main(String[] args) {
		AggregateImpl aggregateImpl = new AggregateImpl();
		
		aggregateImpl.add(new Student("Allen","001"));
		aggregateImpl.add(new Student("Amy","002"));
		aggregateImpl.add(new Student("Aya","003"));
		aggregateImpl.add(new Student("Boy","004"));
		
		StudentIterator iterator =aggregateImpl.getIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		
	}
	
}