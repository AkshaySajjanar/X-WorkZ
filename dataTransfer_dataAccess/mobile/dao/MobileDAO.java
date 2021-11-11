package com.xworkz.dataTransfer_dataAccess.mobile.dao;

import com.xworkz.dataTransfer_dataAccess.mobile.dto.MobileDTO;

public class MobileDAO {

	public MobileDAO() {
		System.out.println("Mobile DAO Created");
	}

	public void displayMobileDTO(MobileDTO obj) {
		System.out.println(obj.getBrand());
		System.out.println(obj.getColor());
		System.out.println(obj.getRam());
		System.out.println(obj.getPrice());

	}

	public void displayMobileDTO(MobileDTO objArray[]) {
		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i].getBrand());
			System.out.println(objArray[i].getColor());
			System.out.println(objArray[i].getRam());
			System.out.println(objArray[i].getPrice());
		}

	}

	public void filterMobileDTO(MobileDTO objArray[], int limit) {
		for (int i = 0; i < objArray.length; i++) {
			if (i == limit) {
				System.out.println(objArray[i].getBrand());
				System.out.println(objArray[i].getColor());
				System.out.println(objArray[i].getRam());
				System.out.println(objArray[i].getPrice());
			}
		}

	}

	public MobileDTO createMobileObject(String brand, String color, int ram, int price) {
		MobileDTO mobileDTO = new MobileDTO(brand, color, ram, price);
		return mobileDTO;
	}

}
