package com.xworkz.dataTransfer_dataAccess.DB.Dao;

public class CompanyA implements DBOperationDao {

	public void connectDb(String user, String password) {
		System.out.println("Company A connect : DB connected");
	}

	public void save(String name, String place) {
		System.out.println("Company A connect : DB saved");
	}

	public void delete(String name) {
		System.out.println("Company A connect : DB deleted");

	}

	public void update(String name, String place) {
		System.out.println("Company A connect : DB updated");

	}

}
