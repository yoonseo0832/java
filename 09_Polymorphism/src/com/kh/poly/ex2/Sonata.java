package com.kh.poly.ex2;

public class Sonata extends Car{
	public Sonata(String color, String fuel, int year) {
		super(color, fuel, year);
	}
	public void drive() {
		System.out.println("Sonata drive!");
	}
	public void moveSonata() {
		System.out.println("move Sonata");
	}
}
