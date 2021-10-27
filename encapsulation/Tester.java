package com.xworkz.encapsulation;

public class Tester {

	public static void main(String[] args) {

		Medicine medicine = new Medicine();
		medicine.setName("Dolo");
		medicine.setMfd("Oct 2021");
		medicine.setMg(100);
		medicine.setExpDate("Oct 2022");
		medicine.setPrice(20);
		System.out.println("Mfd is "+medicine.getMfd());
	}

}
