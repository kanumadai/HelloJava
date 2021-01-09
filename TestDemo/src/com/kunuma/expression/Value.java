package com.kunuma.expression;

public class Value extends Expression{

	private int value;

	public Value(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}

	@Override
	public double Interpret(Context context) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
