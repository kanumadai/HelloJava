package com.kunuma.aggregate;

public interface Aggregate {

	public void add(Student student);
	
	public void romove(Student student);	
	
	public StudentIteratorImpl getIterator();
}
