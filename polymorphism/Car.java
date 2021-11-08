package com.xworkz.polymorphism;

public class Car {

	String brand;
	int price;
	String color;
	Engine engine = new Engine(123456, "Petrol", 1500, 120);

	public void travel() {
		engine.start();
		System.out.println("Travelling");
		engine.stop();
	}
}
