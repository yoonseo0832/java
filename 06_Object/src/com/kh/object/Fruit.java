package com.kh.object;

public class Fruit {
	private String name;
	private int price;
	private String origin;
	private int stock;

	
	//생성자
	public Fruit() {}
	
	public Fruit(String name, int price) {
		this.name= name;
		this.price =price;
	}
	public Fruit(String name, int price, String origin, int stock) {
		this(name,price);
		this.origin=origin;
		this.stock=stock;
	}
	//메소드부 
	public String toString(){
		return "이름: " +name+", "+"가격: "+ price+ ", "+"원산지: "+origin+", "+"재고: "+stock;
	}
	public boolean checkForSale(){
		if(stock<1) {
			return false;
		}else{ 
			return true;
		}//삼항연산자
		//return stock<1?false:true;
		//return !(stock <1);
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
