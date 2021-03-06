package com.kunuma.expression;

public class Plus extends Expression{

	private Expression left;
	private Expression right;
	
	public Plus(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public double Interpret(Context context) {
		return left.Interpret(context)+right.Interpret(context);
	}

	@Override
	public String toString() {
		return "(" + left.toString() + "+" + right.toString() + ")";
	}

	
}
