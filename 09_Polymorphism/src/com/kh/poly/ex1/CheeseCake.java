package com.kh.poly.ex1;

public class CheeseCake extends Cake{
	// 상속받아서 sweet() 
	public void milky() {
		System.out.println("cheesecake milky");
	}

	@Override
	public void yummy() {
		System.out.println("cheesecake yummy");
	}
	
}
