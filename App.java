package com.yash.springiocAssignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Vehicle vehicle=(Vehicle) context.getBean("vehicle");
	vehicle.show();
	System.out.println("----------------------------------------------------");
	Vehicle vehicle2=(Vehicle) context.getBean("vehicle2");
	vehicle2.show();
}
}
