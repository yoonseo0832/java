package com.kh.inherit.after;

public class TV extends Product{
	private int inch;
	
	public TV() {}
	
	public TV(String brand, String code, String name, int price, int inch) {
		//부모클래스인 Product의 매개변수가 4개인 생성자 호출, 위에 모든 것을 호출하고 super()는 this보다 먼저
		super(brand, code, name, price);
		this.inch = inch;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch=inch;
	}
	public String information() {
		return super.information()+",inch: "+inch;
	}
}
