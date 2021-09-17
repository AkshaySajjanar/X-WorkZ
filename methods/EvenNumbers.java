package com.xworkz.methods;

public class EvenNumbers {

	public static void arrayElements(int arrayEvenElements[]) {
		for (int i = 0; i < arrayEvenElements.length; i++) {
			if (arrayEvenElements[i] % 2 == 0) {
				System.out.println("Even numberd are " + arrayEvenElements[i]);
			}
		}
	}

	public static void main(String[] args) {

		int arrayEvenNumbers[] = { 2, 1, 24, 34, 45, 55, 66, 18, 11, 10 };
		EvenNumbers.arrayElements(arrayEvenNumbers);
	}

}
