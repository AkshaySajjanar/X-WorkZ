package com.xworkz.oops;

public class MosquitoBat {
	
	String brand;
	int price;
	String color;
	
	MosquitoBat(String brand,int price, String color) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
	}

}
