package com.yash.springioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Rectangle rectangle = (Rectangle) context.getBean("rectangle");
		rectangle.draw();
		Triangle triangle =  (Triangle) context.getBean("triangle");
		triangle.draw();
		Parallelogram parallelogram = (Parallelogram) context.getBean("parallelogram");
		parallelogram.draw();
	}

}