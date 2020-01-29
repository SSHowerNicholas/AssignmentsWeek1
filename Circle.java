package com.ss.assignments.one;

public class Circle implements Shape {
	
	int radius;
	
	public Circle(int rad) {
		radius = rad;
	}
	@Override
	public double calculateArea() {
		double area = ((radius * 2)* Math.PI);
		return area;
	}

	@Override
	public void display() {
		System.out.println("this is a circle with radius:" + radius);

	}

}
