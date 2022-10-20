package com.yash.springioc2;

public class Triangle extends Shape {

	private float height;
	private float base;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	
	
	public Triangle(float height, float base) {
		super();
		this.height = height;
		this.base = base;
	}

	
	
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		
		float areaTriangle = (height*base)/2;
		System.out.println("Area of Triangle: "+areaTriangle);

	}

}

