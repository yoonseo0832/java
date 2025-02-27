package com.kh.inherit.before;

public class TV {
	private String brand;
	private String code;
	private String name;
	private int price;
	private int inch;
	
	public TV() {}
	
	public TV(String brand, String code, String name, int price,int inch) {
		super(); //부모 클래스의 기본 생성자를 호출(Object)
		this.brand=brand;
		this.code=code;
		this.name=name;
		this.price=price;
		this.inch=inch;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	public String information() {
		return"brand: "+brand+" code: "+code+" name: "+name+" price: "+price+" inch: "+inch;
	}
}
