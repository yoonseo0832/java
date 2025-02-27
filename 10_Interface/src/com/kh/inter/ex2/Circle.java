package com.kh.inter.ex2;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		//원의 넓이
		return (Math.PI)*radius*radius;
	}
	/*
	public double CircleCircum() {
		return (Math.PI)*2*radius;
	}
	*/
}
