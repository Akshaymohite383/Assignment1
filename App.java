package com.yash.springIOCAssignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ConstructorMessage msg = (ConstructorMessage) context.getBean("message");
    	msg.display();
    
    }
}
