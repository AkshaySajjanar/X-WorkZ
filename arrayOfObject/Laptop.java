package com.xworkz.arrayOfObject;

public class Laptop {
	String brand;
	int price;
	String color;
	int ramSize;

	public Laptop(String brand, int price, String color, int ramSize) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ramSize = ramSize;
	}

	public void on() {
		System.out.println("Laptop is ON");
	}

	public void coding() {
		System.out.println("User can write code");
	}

	public void playGames() {
		System.out.println("Users can play games");
	}

	public void playVideo() {
		System.out.println("User can play videos/");
	}

}
