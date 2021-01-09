package com.kunuma.combination;

public abstract class MenuComponet {

	protected String name;
	
	protected int level;
	
	//add menu
	public void add(MenuComponet componet) {
		throw new UnsupportedOperationException();
		
	}
	//remove menu
	public void remove(MenuComponet componet) {
		throw new UnsupportedOperationException();		
	}
	
	//get name child menu
	public MenuComponet getChild(int index) {
		throw new UnsupportedOperationException();		
	}
	
	//get menu name
	public String getName() {
		return name;		
	}
	
	//print menu and sub menu
	public abstract void printMenu();
	
	
	
	
}
