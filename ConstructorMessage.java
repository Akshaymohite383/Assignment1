package com.yash.springIOCAssignment3;

public class ConstructorMessage {

	private String message = null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	
	}
	
	public void display() {
		System.out.println(message);
	}
}
