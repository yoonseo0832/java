package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind; 
	private String name; 
	private String flavor;
	private int numOf; 
	private int price;
	
	public Snack() {}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numOf=numOf;
		this.price=price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		/*
		String info = kind+"("+name+" - "+ flavor+ ")"+numOf+ "개 "+price+"원";
		return info;
		*/
		//문자열 특정 형식으로 변환해주는 기능: String.format("형식", 값/데이터) : String
		String info = String.format("%s(%s - %s) %d개 %d원", kind, name, flavor, numOf, price);
		return info;
	}
}
