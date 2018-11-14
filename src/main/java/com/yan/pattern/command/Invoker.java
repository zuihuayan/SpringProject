package com.yan.pattern.command;

public class Invoker {
	
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void callOpen() {
		command.open();
	}
	
	public void callClose() {
		command.close();
	}
}
