package com.yash.springIOCAssignment4;

public class SetterMessage {

	private String message=null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display()
	{
		System.out.println(message);
	}
	
}