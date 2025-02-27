package com.kh.practice.point.controller;
import com.kh.practice.point.model.vo.Rectangle;
public class RectangleController {	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		double area=width*height;
		return  r.toString()+" 면적: "+ area;
	}
	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		double peri = 2*(width+height);
		return r.toString()+" 둘레: "+ peri;
	}
}
