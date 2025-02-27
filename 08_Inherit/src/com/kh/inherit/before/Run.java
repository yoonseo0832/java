package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop ds = new Desktop("LG", "lg-1033", "사무용pc", 1000000, false);
		System.out.println(ds.information());
		
		TV tv = new TV("삼성", "LED23-12", "뉴디지털LED", 2000000, 25);
		System.out.println(tv.information());
	}

}
