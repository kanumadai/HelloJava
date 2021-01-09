package com.kunuma.memento.black;

public class Client{
	
	public static void main(String[] args) {
		System.out.println("Game start.........");
		
		GameRolse gameRolse = new GameRolse();
		gameRolse.initState();

		System.out.println(gameRolse);
		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
		//key
		roleStateCaretaker.setMemento(gameRolse.saveState());
		//
		
		System.out.println("Game over.........");
		gameRolse.fight();
		System.out.println(gameRolse);
		

		System.out.println("Game recover.........");
		//key
		gameRolse.recoverState(roleStateCaretaker.getMemento());
		//
		System.out.println(gameRolse);
	}
}
