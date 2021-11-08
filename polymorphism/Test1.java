package com.xworkz.polymorphism;

public class Test1 {

	public static void main(String[] args) {
		Address address = new Address("Bagalkot", 38, "2nd stage", 5871030);

		Bank bank = new Bank("SBI", "b2", address);
		bank.display();
	}

}
