package com.kunuma.clone;

public class Client{
	public static void main(String[] args) throws Exception {
		Citation citation = new Citation();
		
		Citation citation2 = (Citation) citation.clone();
		
		citation.setName("Allen");
		citation2.setName("Amy");
		
		citation.show();
		citation2.show();
	}
}