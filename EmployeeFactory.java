package com.yash.springiocassignment5;

public class EmployeeFactory {
public static Employee getEmployee() {
	return new Clerk(); 
//	return new Manager();
	//return new Supervisor();
}
}
