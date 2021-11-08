package com.xworkz.polymorphism;

public class SamsungGalaxy extends Phone {

	boolean isLocked = true;

	public SamsungGalaxy() {
		System.out.println("Inside the damsung galaxy child class");
	}

	@Override
	public void phoneUnlocking() {
		if (isLocked) {
			super.phoneUnlocking(); // calling the phoneUnlocking method from the parent class
		}
		System.out.println("Unlocking using fingerprint");
	}

	public void installGame() {
		System.out.println("Game installed");
	}
}
