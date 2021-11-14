package com.xworkz.dataTransfer_dataAccess.clock.dao;

import com.xworkz.dataTransfer_dataAccess.clock.dto.ClockDto;

public class ClockDao {

	public ClockDao() {
		System.out.println("Inside a clock dao");
	}

	ClockDto clock[] = new ClockDto[4];
	int index = 0;

	public void saveDto(ClockDto obj) {
		clock[index] = obj;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < clock.length; i++) {
			System.out.println(clock[i].getBrand());
			System.out.println(clock[i].getPrice());
			System.out.println(clock[i].getType());
			System.out.println(clock[i].getColor());
			System.out.println("------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brandName)) {
				System.out.println(clock[i].getBrand());
				System.out.println(clock[i].getPrice());
				System.out.println(clock[i].getType());
				System.out.println(clock[i].getColor());
				System.out.println("------------------");
			}
		}
	}

	public void updateTypeByBrandName(String brandName, String newType) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brandName)) {
				clock[i].setType(newType);
			}
		}
	}

	public void deleteByBrandName(String brand) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brand)) {
				clock[i] = null;
			}
		}
	}

	public ClockDto createObject(String brand, int price, String type, String color) {
		ClockDto clockDto = new ClockDto(brand, price, type, color);
		return clockDto;
	}
}
