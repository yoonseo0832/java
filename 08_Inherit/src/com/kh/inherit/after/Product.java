package com.kh.inherit.after;

public class Product {
	//공통적으로 사용되는 필드
	private String brand;
	private String code;
	private String name;
	private int price;

	// 생성자 정의
	public Product() {
	}
	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}
	//공통적으로 사용된 부분에 대한 메소드
	public String information() {
		//각 클래스 별로 추가된 필드를 제외한 정보만 반환 및 리턴
		return "brand: " + brand + ", code: " + code + ", name: " + name + ", price: " + price;
	}
	//private으로 정의되어 필드로 getter/setter 필
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
}
