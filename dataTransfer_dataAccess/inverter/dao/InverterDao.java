package com.xworkz.dataTransfer_dataAccess.inverter.dao;

import com.xworkz.dataTransfer_dataAccess.inverter.dto.InverterDto;

public class InverterDao {

	public InverterDao() {
		System.out.println("Inverter DAO created");
	}

	InverterDto inverter[] = new InverterDto[3];
	int index = 0;

	public void saveDto(InverterDto obj) {
		inverter[index] = obj;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < inverter.length; i++) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getPrice());
			System.out.println(inverter[i].getCapcaity());
			System.out.println();

		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brandName)) {
				System.out.println(inverter[i].getBrand());
				System.out.println(inverter[i].getPrice());
				System.out.println(inverter[i].getCapcaity());
			}
		}
	}

	public void updatePriceByBrandName(String brandName, int newPrice) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brandName)) {
				inverter[i].setPrice(newPrice);
			}

		}
	}

	public void updateBrandNameByBrandName(String brand, String brandName) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brand)) {
				inverter[i].setBrand(brandName);
			}
		}
	}

	public void deleteByBrandName(String brand) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brand)) {
				inverter[i] = null;
			}
		}
	}

	public InverterDto createObject(String brand, int price, int capacity) {
		InverterDto inverterDto = new InverterDto(brand, price, capacity);
		return inverterDto;
	}

}
