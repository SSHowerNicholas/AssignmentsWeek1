package com.ss.assignments.one;

public class Triangle implements Shape {
	int base;
	int height;

	public Triangle(int bas, int hei) {
		base = bas;
		height = hei;
	}
	
	@Override
	public double calculateArea() {
		double area = 0.5 * base * height;
		return area;
	}

	@Override
	public void display() {
		System.out.println("This is a triangle with base:" + base + "and height:" + height);
	}

}
