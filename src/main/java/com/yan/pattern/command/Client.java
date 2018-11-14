package com.yan.pattern.command;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		Command command = new LightACommand();
		invoker.setCommand(command);
		
		invoker.callOpen();
		invoker.callClose();
		
		Command command2 = new LightBCommand();
		invoker.setCommand(command2);
		
		invoker.callOpen();
		invoker.callClose();
	}
}
