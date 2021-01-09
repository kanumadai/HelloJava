package com.kunuma.combination;

public class Client{
	public static void main(String[] args) {
		
		//create menu tree
		MenuComponet menu1 = new Menu("Menu Manage",2);
		 menu1.add(new Menu("Menu ManageSub1",3));
		 menu1.add(new Menu("Menu ManageSub2",3));
		 menu1.add(new Menu("Menu ManageSub3",3));
		MenuComponet menu2 = new Menu("Menu Limit",2);
		 menu2.add(new Menu("Menu LimitSub1",3));
		 menu2.add(new Menu("Menu LimitSub2",3));
		 menu2.add(new Menu("Menu LimitSub3",3));
		MenuComponet menu3 = new Menu("Menu Role",2);
		 menu3.add(new Menu("Menu RoleSub1",3));
		 menu3.add(new Menu("Menu RoleSub1",3));
		 menu3.add(new Menu("Menu RoleSub1",3));
		 
		 //create root menu
		MenuComponet componet= new Menu("System menu",1);
		componet.add(menu1);
		componet.add(menu2);
		componet.add(menu3);
		
		componet.printMenu();
	}
}