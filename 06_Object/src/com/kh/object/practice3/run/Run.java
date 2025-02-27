package com.kh.object.practice3.run;
import com.kh.object.practice3.model.vo.Circle;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setAreaOfCircle();
		c1.setSizeOfCircle();
		System.out.println("area: "+c1.getAreaOfCircle()+", size: "+c1.getSizeOfCircle());
		c1.incrementRadius();
		System.out.print("area: "+c1.getAreaOfCircle()+", size: "+c1.getSizeOfCircle());
	}

}
