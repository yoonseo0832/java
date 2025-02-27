package com.kh.practice.point.model.vo;

public class Point {
	// 변수: 2 x,y 메소드: getter/setter 4, toString 1 
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "x: "+ x+", y: "+y;
	}
	
}
