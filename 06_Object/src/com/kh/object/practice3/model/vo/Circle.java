package com.kh.object.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private static int radius = 1;
	double result1 = (PI)*(double)(Math.pow(radius, 2));
	double result2 = (PI)*(double)(radius)*2;
	public Circle() {}
	
	public double getAreaOfCircle() {
		return result1;
	}
	public void setAreaOfCircle() {
		result1 =  (PI)*(double)(radius*radius);
	}
	public double getSizeOfCircle() {
		return result2;
	}
	public void setSizeOfCircle() {
		result2 = (PI)*2*(double)(radius);
	}
	public void incrementRadius() {
		radius++;
		setAreaOfCircle();
		setSizeOfCircle();
	}
}
