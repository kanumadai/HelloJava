package com.kunuma.expression;

public class Variable extends Expression{

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public double Interpret(Context context) {
		return  context.getValue(this);
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
