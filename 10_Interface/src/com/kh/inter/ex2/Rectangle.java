package com.kh.inter.ex2;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		return height*width;
	}
	/*
	public double RectangleCircum() {
		return (2*(height+width));
	}
	*/
}
