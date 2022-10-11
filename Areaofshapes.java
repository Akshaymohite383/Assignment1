package Com.yash.oops;

import java.util.*;

abstract class shape {
	int a, b;

	abstract public void printarea();
}
class Triangle extends shape {
	double area_tri;	
	public void printarea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base and height of triangle");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Base of triangle " + a + "height of triangle " + b);
		area_tri = (0.5 * a * b);
		System.out.println("The area of triangle is:" + area_tri);
	}
}

class Sphere extends shape {
	public double area_sphere;

	public void printarea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Radius of Sphere");
		a = s.nextInt();
		area_sphere = (4 * 3.14 * a * a);
		System.out.println("Radius of Sphere " + a);
		System.out.println("The area of Sphere is:" + area_sphere);
	}
}

class Circle extends shape {
	double area_circle;

	public void printarea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		a = s.nextInt();
		area_circle = (3.14 * a * a);
		System.out.println("Radius of circle" + a);
		System.out.println("The area of circle is:" + area_circle);
	}
}

public class Areaofshapes{



	public static void main(String[] args) {
		Sphere sp = new Sphere();
		sp.printarea();
		Triangle t = new Triangle();
		t.printarea();
		Circle c = new Circle();
		c.printarea();
	}
}
