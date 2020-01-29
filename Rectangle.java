package com.ss.assignments.one;

public class Rectangle implements Shape {

	int len;
	int wid;
	
	public Rectangle(int leng, int widt) {
		len = leng;
		wid = widt;
	}
	
	@Override
	public double calculateArea() {
		double area = len*wid;
		return area;
	}

	@Override
	public void display() {
		System.out.println("This is a rectangle with length:" + len + " and width:" + wid);
		
	}

}
