package com.yan.pattern.responsibilityChain;

public abstract class Handler {
	protected Handler next;
	
	public void setHandler(Handler next) {
		this.next = next;
	}
	
	public abstract void handleRequest();
}
