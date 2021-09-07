package com.xworkz.controlStatements;

public class CarDetails {

	public static void main(String[] args) {
		String carManufacturer = "Renault";
		
		switch (carManufacturer) {
		
		case "Toyota":
			System.out.println("Model: Toyota Innova Crysta.");
			System.out.println("Ex-Showroom Price: Rs.16.4L - Rs.25L.");
			System.out.println("Fuel Economy: 11-16kmpl.");
			System.out.println("Engine: 2.7 L 4-cylinder.");
			break;
			
		case "Suzuki":
			System.out.println("Model. Maruti Suzuki Dzire.");
			System.out.println("Ex-Showroom Price: Rs.5.98L - Rs.9.02L.");
			System.out.println("Fuel Economy: 22-24kmpl.");
			System.out.println("Engine: 1.2 L 4-cylinder.");
			break;
			
		case "Tata":
			System.out.println("Model: Tata Nexon.");
			System.out.println("Ex-Showroom Price: Rs.7.28L - Rs.13.2L.");
			System.out.println("Fuel Economy: 20-22kmpl.");
			System.out.println("Engine: 1.5 L 4-cylinder.");
			break;
			
		case "Kia":
			System.out.println("Model: Kia Seltos.");
			System.out.println("Ex-Showroom Price: Rs.9.95L - Rs.17.6L.");
			System.out.println("Fuel Economy: 16-21kmpl.");
			System.out.println("Engine: 1.5 L 4-cylinder.");
			break;
			
		case "Renault":
			System.out.println("Model: Renault Duster.");
			System.out.println("Ex-Showroom Price: Rs.9.86L - Rs.14.3L.");
			System.out.println("Fuel Economy: 11-14kmpl.");
			System.out.println("Engine: 1.3 L and 1.5 L 4-cylinder.");
			break;
			
		default: System.out.println("Please enter the valid Car Manufacturer.");
		}
		
	}

}
