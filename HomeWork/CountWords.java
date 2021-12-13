package com.xworkz.HomeWork;

public class CountWords {

	public static void main(String[] args) {

		String a = "xworkz is located in Rajajinagar, Bangalore. It is sorftware training institution.";
		char[] charArray = a.toCharArray();
		int count = 1;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				count++;
			}
		}
		System.out.println(count);

		/*
		 * String[] count = a.split(" "); int a1 = count.length; System.out.println(a1);
		 */

	}
}
