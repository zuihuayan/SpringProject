package com.yan.pattern.command;

public class LightBCommand extends Command {
	LightB lightB;
	
	public LightBCommand() {
		this.lightB = new LightB();
	}

	@Override
	public void open() {
		lightB.open();

	}

	@Override
	public void close() {
		lightB.close();
		
	}

}
