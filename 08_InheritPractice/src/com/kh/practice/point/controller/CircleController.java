package com.kh.practice.point.controller;
import com.kh.practice.point.model.vo.Circle;
public class CircleController {
	private Circle c = new Circle();
	public String calcCircleArea(int x, int y, int radius) {
		//setter메소드 이용한 방법
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = Math.PI*radius*radius;
		String result = c.toString()+" 면적: "+area;
		return result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		//생성자 사용하는 방법
		c = new Circle(x,y,radius);
		double circum = Math.PI*radius*2;
		return c.toString()+"둘레: "+circum;
	}
}
