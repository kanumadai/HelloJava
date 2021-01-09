package com.kunuma.command;

import java.util.ArrayList;
import java.util.List;


public class Waitor {

	private List<Command> commands = new ArrayList<Command>();

	public List<Command> getCommands() {
		return commands;
	}

	public void setCommand(Command command) {
		this.commands.add(command);
	}
	
	public void orderUp() {
		System.out.println("Waitor: Order is comming.....");
		for(Command command:commands) {
			if (command!=null) {
				command.execute();
			}
		}
		
	}
}
