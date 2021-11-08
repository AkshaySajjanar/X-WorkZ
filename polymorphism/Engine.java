package com.xworkz.polymorphism;

public class Engine {

	int engineNumber;
	String type;
	int cc;
	int hp;

	public Engine(int engineNumber, String type, int cc, int hp) {
		System.out.println("Inside engine");
		this.engineNumber = engineNumber;
		this.type = type;
		this.cc = cc;
		this.hp = hp;
	}

	public void start() {
		System.out.println("Engine started");
	}

	public void stop() {
		System.out.println("Engine stopped");
	}
}
