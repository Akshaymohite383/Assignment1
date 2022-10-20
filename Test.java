package com.yash.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	City c=(City) context.getBean("city1");
	c.show();		
}
}
