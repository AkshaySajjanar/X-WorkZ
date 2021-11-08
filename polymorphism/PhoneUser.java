package com.xworkz.polymorphism;

public class PhoneUser {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.message();
		phone.phoneUnlocking();

		System.out.println();

		SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
		samsungGalaxy.call();
		samsungGalaxy.message();
		samsungGalaxy.phoneUnlocking();
	}

}
