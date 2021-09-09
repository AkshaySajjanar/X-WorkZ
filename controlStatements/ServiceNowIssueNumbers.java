package com.xworkz.controlStatements;

public class ServiceNowIssueNumbers {

	public static void main(String[] args) {

		System.out.println("Beginning");
		int issueNumber[] = { 110, 123, 134, 156, 178, 189, 188, 190, 888, 909 };

		for (int i = 0; i < issueNumber.length; i++) {
//			if (issueNumber[i] % 2 == 0) {
//				System.out.println(issueNumber[i]);
			if (i%2 == 0) {
				System.out.println(issueNumber[i]); //to print only even index values.
			}
			}
		}
	}


