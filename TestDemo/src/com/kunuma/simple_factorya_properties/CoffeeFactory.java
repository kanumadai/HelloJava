package com.kunuma.simple_factorya_properties;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

	private static Map<String, Coffee> map =new HashMap<String, Coffee>();
	
	static {
		
		Properties properties = new Properties();
		InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
		try {
			properties.load(is);
			Set<Object> keys = properties.keySet();
			for (Object key:keys) {
				String className = properties.getProperty((String) key);
				
				Class clazz = Class.forName(className);
				Coffee obj = (Coffee) clazz.getConstructor().newInstance();
				map.put((String) key, obj);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static Coffee createCoffee(String name) {
		return map.get(name);
	}
	
}
