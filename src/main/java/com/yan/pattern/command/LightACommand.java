package com.yan.pattern.command;

public class LightACommand extends Command{
	LightA lightA;
	
	public LightACommand() {
		lightA = new LightA();
	}

	@Override
	public void open() {
		lightA.open();
		
	}

	@Override
	public void close() {
		lightA.close();
		
	}
	
	
}
