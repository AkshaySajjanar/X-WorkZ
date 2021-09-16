package com.xworkz.methods;

public class LargestNumber {

	public static int max(int array[]) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int numbers[] = { 10, 12, 114, 15, 16, 18, 20, 1, 2, 40 };

		int largest = LargestNumber.max(numbers);
		System.out.println(largest);
	}

}
