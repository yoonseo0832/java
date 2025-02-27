package com.kh.poly.ex2;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	public Car() {}
	
	public Car(String color, String fuel, int year) {
		this.color=color;
		this.fuel=fuel;
		this.year=year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car color: " + color + ", fuel: " + fuel + ", year: " + year;
	}
	public void drive() {
		System.out.println("Car drive!");
	}
	
}
