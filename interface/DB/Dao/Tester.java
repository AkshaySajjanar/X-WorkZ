package com.xworkz.dataTransfer_dataAccess.DB.Dao;

public class Tester {
	public static void main(String[] args) {
		CompanyA companyA = new CompanyA();
		
		companyA.connectDb("tcs", "aajj");
		companyA.save("tcs", "aajj");
		companyA.delete("TCS");
		companyA.update("tcs", "aajj");
	}

}
