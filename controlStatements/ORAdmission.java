package com.xworkz.controlStatements;

public class ORAdmission {

	public static void main(String[] args) {
		short bloodPressure = 141;
		
		if (bloodPressure >= 90 && bloodPressure <= 140) {
			System.out.println("Can be admitted to Operating Room");
			
		} else {
			System.out.println("Can't be admitted");
		}
	}

}
