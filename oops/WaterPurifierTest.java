package com.xworkz.oops;

public class WaterPurifierTest {

	public static void main(String[] args) {

		WaterPurifier eureka = new WaterPurifier("eureka", 10000, 1234, 12);
//		eureka.brand = "eureka";
//		eureka.model = 12;
//		eureka.price = 10000;
//		eureka.serialNumber = 1234;

		System.out.println(eureka.brand);
		System.out.println(eureka.model);
		System.out.println(eureka.price);
		System.out.println(eureka.serialNumber);

	}

}
