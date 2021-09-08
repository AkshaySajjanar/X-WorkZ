package com.xworkz.controlStatements;

public class DrivingLicenceApp {

	public static void main(String[] args) {
		byte ageLowerLimit = 18;
		byte ageUpperLimit = 60;
		
		byte personAge = 45;
		
		if (personAge>=ageLowerLimit && personAge<=ageUpperLimit) {
			System.out.println("He is eligible");
		}else {
			System.out.println("not eligible");
		}
	}

}
