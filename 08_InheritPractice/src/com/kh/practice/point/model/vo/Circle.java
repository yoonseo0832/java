package com.kh.practice.point.model.vo;

public class Circle extends Point{
	//변수: 본인 변수+ 부모 변수 총 3, 메소드: 3+4(toString 재정의(오버라이딩)해서 제외하고 부모의 4
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", radius: "+ radius;
	}
	
} 
