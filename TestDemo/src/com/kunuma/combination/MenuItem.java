package com.kunuma.combination;

public class MenuItem extends MenuComponet{

	public MenuItem(String name,int level) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.level = level;
	}
	
	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		for (int i = 0; i < level; i++) {
			System.out.print("|-");
		}
		System.out.println(name);
	}

}
