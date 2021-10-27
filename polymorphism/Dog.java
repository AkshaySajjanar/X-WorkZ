package com.xworkz.polymorphism;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Inside the dog class");
	}

	@Override
	public void sound() {
		System.out.println("Inplemented in dog class");
		System.out.println("Bow Bow");
	}
}
