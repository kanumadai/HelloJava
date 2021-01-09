package com.kunuma.aggregate;

public class Student {

	private String name;
	private String numb;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumb() {
		return numb;
	}
	public void setNumb(String numb) {
		this.numb = numb;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", numb=" + numb + "]";
	}
	public Student(String name, String numb) {
		super();
		this.name = name;
		this.numb = numb;
	}
	
	
}
