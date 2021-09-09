package com.xworkz.controlStatements;

public class NumbersDivisibleBy5 {

	public static void main(String[] args) {

		int numbers[] = { 112, 111, 116, 117, 120, 121, 124, 129, 128, 130 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 0) {
				System.out.println(numbers[i]);
			}
		}

	}

}
