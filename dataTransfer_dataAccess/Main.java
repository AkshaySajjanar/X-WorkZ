package com.xworkz.dataTransfer_dataAccess;

public class Main {

	static int fac = 1;

	public static int factorailNumber(int num) {

		for (int i = 0; i <= num; i++) {
			fac = fac * i;
		}
		return fac;

	}

}
