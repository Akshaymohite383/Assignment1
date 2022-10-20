package com.yash.springioc2;

public class Rectangle extends Shape {

	private float width;
	private float length;

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		float areaRectangle = width*length;
		
		System.out.println("Area of Rectangle: "+areaRectangle);

	}

}

