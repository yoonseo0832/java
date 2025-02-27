package com.kh.object.practice2.model.vo;

public class Product {
	private String productName;
	private int price;
	private String brand;
	
	public Product() {
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String name) {
		this.productName = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void information() {
		System.out.printf("제품명: %s, 가격: $%d, 제조사: %s\n",productName,price,brand);
	}
}
