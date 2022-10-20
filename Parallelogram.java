package com.yash.springioc2;
public class Parallelogram extends Shape {

	private float base;
	private float height;

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	

	public Parallelogram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parallelogram(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	

	@Override
	public String toString() {
		return "Parallelogram [base=" + base + ", height=" + height + "]";
	}

	@Override
	public void draw() {
		
		float areaParallelogram = base*height;
		
		System.out.println("Area of Parallelogram: "+areaParallelogram);

	}

}

