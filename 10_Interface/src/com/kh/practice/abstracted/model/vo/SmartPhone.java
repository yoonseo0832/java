package com.kh.practice.abstracted.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;  //제조사
	
	public SmartPhone() {}
	
	public abstract String printInformation();
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker=maker;
	}
}
