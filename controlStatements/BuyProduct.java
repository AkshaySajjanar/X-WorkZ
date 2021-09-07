package com.xworkz.controlStatements;

public class BuyProduct {

	public static void main(String[] args) {
		
		short yearofManufactured = 2019;
		
		short price = 3000;
		if(yearofManufactured >= 2019 && price<=3000) {
			System.out.println("Continue shopping");
		}
		else {
			System.out.println("Product expired");
		}
	}

}
