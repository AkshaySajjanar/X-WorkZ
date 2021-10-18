package com.xworkz.arrayOfObject;

public class EndUser {
	public static void displayInfo(PhonePayV001 objs[]) {
		System.out.println("PhonePay Information");
		System.out.println();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releaseYear);
			System.out.println("--------------------");
		}
	}

	public static void main(String[] args) {
		PhonePayV001 phonePayV001 = new PhonePayV001("PhonePe", "V001", 2016);
		PhonePayV001 phonePayV0012 = new PhonePayV001("PhonePe", "V002", 2017);
		PhonePayV001 phonePayV0013 = new PhonePayV001("PhonePe", "V003", 2018);
		PhonePayV001 phonePayV0014 = new PhonePayV001("PhonePe", "V004", 2018);

		PhonePayV001 objs[] = { phonePayV001, phonePayV0012, phonePayV0013, phonePayV0014 };
		EndUser.displayInfo(objs);
	}

}
