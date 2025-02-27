package com.kh.io;

import java.io.Serializable;

//Serializable 인터페이스 상속 => 직렬화 상속하고 있지 않으면 오류 발생
public class Product implements Serializable{
	private String name;
	private int price;
	
	public Product(String name, int price) {
		super();
		this.name =name;
		this.price =price;
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
