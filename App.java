package com.yash.springIOCAssignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SetterMessage msg= (SetterMessage) context.getBean("message1");
        msg.display();
    }
}
