package com.xworkz.controlStatements;

public class SumofArrayElements {

	public static void main(String[] args) {

		int numbers[] = { 112, 111, 116, 117, 120, 121, 124, 129, 128, 130 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(sum);
	}

}
