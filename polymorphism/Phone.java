package com.xworkz.polymorphism;

public class Phone {

	String brand;
	int price;
	int ram;
	int internalStorage;
	String color;

	public Phone() {
		System.out.println("Inside Phone");
	}

	public void call() {
		System.out.println("calling from phone");
	}

	public void message() {
		System.out.println("Messaging from phone");
	}

	public void phoneUnlocking() {
		System.out.println("Unlocking using password");
	}

}
