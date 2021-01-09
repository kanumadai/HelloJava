package com.kunuma.flyweight;

import java.util.HashMap;

public class BoxFactory {

	private HashMap<String, AbstractBox> map;

	public BoxFactory() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, AbstractBox>();
		map.put("I", new Ibox());
		map.put("O", new Obox());
		map.put("L", new Lbox());	
		map.put("J", new Jbox());
		map.put("S", new Sbox());
		map.put("Z", new Zbox());
		map.put("T", new Tbox());
	}
	
	public static BoxFactory getInstance() {
		return factory;
	}

	private static BoxFactory factory = new BoxFactory();
	public AbstractBox getShape(String name) {
		return map.get(name);
		
	}
}
