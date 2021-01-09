package com.kunuma.command;

import java.util.HashMap;
import java.util.Map;

public class Order {

	private int diningTable;
	
	private Map<String, Integer> foodDirMap = new HashMap<String, Integer>();

	public int getDiningTable() {
		return diningTable;
	}

	public void setDiningTable(int diningTable) {
		this.diningTable = diningTable;
	}

	public Map<String, Integer> getFoodDirMap() {
		return foodDirMap;
	}

	public void setFood(String name,int numb) {
		this.foodDirMap.put(name, numb);
	}
	
}
