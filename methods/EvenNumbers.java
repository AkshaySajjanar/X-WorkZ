package com.xworkz.methods;

public class EvenNumbers {

	public static int[] arr() {
		int numbers[] = { 112, 111, 116, 117, 120, 121, 124, 129, 128, 130 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		return numbers;
	}

	public static void main(String[] args) {

		int a[] = EvenNumbers.arr();
		System.out.println(a);
	}

}
