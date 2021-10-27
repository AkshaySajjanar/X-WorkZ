package com.xworkz.polymorphism;

public class Cat extends Animal {

	public Cat() {
		System.out.println("Inside the Cat Class");
	}

	@Override
	public void sound() {
		System.out.println("Meow Meow");
	}
}
