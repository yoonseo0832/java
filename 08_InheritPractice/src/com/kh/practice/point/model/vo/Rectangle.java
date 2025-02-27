package com.kh.practice.point.model.vo;

public class Rectangle extends Point{
	//멤버 정보=> 변수/메소드  변수: 2+2 총 4(height, width, x, y) , 메소드: 5+ 4 총 9
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		//super(x,y);
		//super.setX(x);
		this.setX(x);
		setY(y);
		this.width=width;
		this.height=height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" width: "+width+", height: "+height;
	}
	
}
