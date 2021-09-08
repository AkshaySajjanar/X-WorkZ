package com.xworkz.controlStatements;

public class BlockPopulation {

	public static void main(String[] args) {
		char block = 'C';
		
		switch (block) {
		case 'A':
			System.out.println("A block population is 30000");
			break;
		case 'B':
			System.out.println("B block population is 40000");
			break;
		case 'C':
			System.out.println("C block population is 50000");
			break;
		case 'D':
			System.out.println("D block population is 60000");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
