package com.xworkz.methods;

public class ArrayLength {
	public static int length(int array[]) {
		return array.length;
	}

	public static void main(String[] args) {

		int numbers[] = { 12, 23, 34, 45, 56, 67, 78, 89, 90, 100 };

		int lenghtOfArray = ArrayLength.length(numbers);

		System.out.println("The length of array is " + lenghtOfArray);
	}

}
