package com.kunuma.combination;

import java.util.ArrayList;
import java.util.List;


public class Menu extends MenuComponet{

	private List<MenuComponet> menuComponetList =new ArrayList<MenuComponet>(); 
	
	//constructor
	public Menu(String name,int level) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.level = level;
	}
	
	@Override
	public void add(MenuComponet componet) {
		// TODO Auto-generated method stub
		menuComponetList.add(componet);
	}

	@Override
	public void remove(MenuComponet componet) {
		// TODO Auto-generated method stub
		menuComponetList.remove(componet);
	}

	@Override
	public MenuComponet getChild(int index) {
		// TODO Auto-generated method stub
		return menuComponetList.get(index);
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		for (int i = 0; i < level; i++) {
			System.out.print("|-");
		}
		System.out.println(name);
		for(MenuComponet componet:menuComponetList) {
			componet.printMenu();
		}
	}

}
