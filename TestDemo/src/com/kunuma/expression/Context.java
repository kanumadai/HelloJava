package com.kunuma.expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map<Variable, Integer> contextMap = new HashMap<>();

	public void assign(Variable variable ,Integer integer) {
		contextMap.put(variable, integer);
	}
	
	public int getValue(Variable variable) {
		return contextMap.get(variable);
	}
	
}
