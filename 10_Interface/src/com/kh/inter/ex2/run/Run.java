package com.kh.inter.ex2.run;
import com.kh.inter.ex2.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sArr = new Shape[2];
		for(int i=0; i<sArr.length; i++) {
			sArr[0] = new Circle(5);
			sArr[1] = new Rectangle(3,4);
		}
		for(int i = 0; i<sArr.length; i++) {
			if(sArr[i] instanceof Circle) {
				System.out.print("원의 넓이: ");
			}else if(sArr[i] instanceof Rectangle) {
				System.out.print("사각형의 넓이: ");
			}
			System.out.println(sArr[i].calculateArea());
		}
	}

}
