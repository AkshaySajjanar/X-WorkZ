package com.xworkz.constructor;

public class PhonePeTester {

	public static void main(String[] args) {

		PhonePe phonepe = new PhonePe();
		phonepe.name = "Akshay";
		phonepe.email = "akshay.xworkz@gmail.com";
		phonepe.mobileNo = 9742872820L;
		phonepe.place = "Bagalkot";
		phonepe.aadharNo = 589076953607L;
		phonepe.panNo = "HZNPS8621J";
		phonepe.displayInfo();
		System.out.println();

		PhonePe phonepe1 = new PhonePe("Akshay", 9742872820L, "Bagalkot");
		phonepe1.displayInfo();
		System.out.println();

		PhonePe phonepe2 = new PhonePe("Akshay", 9742872820L, "Bagalkot", 589079653607L);
		phonepe2.displayInfo();
		System.out.println();

		PhonePe phonepe3 = new PhonePe("Akshay", 9742872820L, "Bagalkot", "HZNPS8621J");
		phonepe3.displayInfo();
		System.out.println();

		PhonePe phonepe4 = new PhonePe("Akshay", "akshay.xworkz@gmail.com", 9742872820L, "Bagalkot", 589079635607L,
				"HZNPS8621J");
		phonepe4.displayInfo();

	}

}
