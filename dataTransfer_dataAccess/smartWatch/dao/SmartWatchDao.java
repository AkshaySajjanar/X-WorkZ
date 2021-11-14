package com.xworkz.dataTransfer_dataAccess.smartWatch.dao;

import com.xworkz.dataTransfer_dataAccess.smartWatch.dto.SmartWatchDto;

public class SmartWatchDao {

	SmartWatchDto smartWatch[] = new SmartWatchDto[5];
	int index = 0;

	public SmartWatchDao() {
		System.out.println("Samrt Watch Dao created");
	}

	public void saveDTO(SmartWatchDto dto) {
		System.out.println("Inside the save method");
		smartWatch[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < smartWatch.length; i++) {
			System.out.println(smartWatch[i].getBrand());
			System.out.println(smartWatch[i].getColor());
			System.out.println(smartWatch[i].getSerialNumber());
			System.out.println(smartWatch[i].getPrice());
			System.out.println("------------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brandName)) {
				System.out.println(smartWatch[i].getBrand());
				System.out.println(smartWatch[i].getColor());
				System.out.println(smartWatch[i].getSerialNumber());
				System.out.println(smartWatch[i].getPrice());
				System.out.println("------------------------");
			}
		}
	}

	public void updateBy(String brand, int newPrice) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brand)) {
				smartWatch[i].setPrice(newPrice);
			}
		}
	}

	public void updateBrandNameByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brand)) {
				smartWatch[i].setBrand(newBrandName);
			}
		}
	}
	
	public void deleteBySerialNumber(int serialNumber) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getSerialNumber() == serialNumber) {
				smartWatch[i] = null;
			}
		}
	}
}
