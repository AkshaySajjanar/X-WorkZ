package com.xworkz.dataTransfer_dataAccess.microoven.dao;

import com.xworkz.dataTransfer_dataAccess.microoven.dto.MicroovenDto;

public class MicroovenDao {

	public MicroovenDao() {
		System.out.println("Microven dao created");
	}

	
	MicroovenDto microoven[] = new MicroovenDto[4];
	int index = 0;

	public void saveDto(MicroovenDto obj) {
		microoven[index] = obj;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < microoven.length; i++) {
			System.out.println(microoven[i].getBrand());
			System.out.println(microoven[i].getColor());
			System.out.println(microoven[i].getPrice());
			System.out.println(microoven[i].getCapacity());
			System.out.println("-----------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(brandName)) {
				System.out.println(microoven[i].getBrand());
				System.out.println(microoven[i].getColor());
				System.out.println(microoven[i].getPrice());
				System.out.println(microoven[i].getCapacity());
				System.out.println("-----------------------");
			}
		}
	}
	

	public void updatePriceByBrandName(String brandName, int newPrice) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(brandName)) {
				microoven[i].setPrice(newPrice);
			}
		}
	}

	public void updateBrandNameByBrandName(String brandName, String newBrandName) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(brandName)) {
				microoven[i].setBrand(newBrandName);
			}
		}
	}

	public void deleteByBrandName(String brand) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(brand)) {
				microoven[i] = null;
			}
		}
	}
	
	public void deleteByPrice(int price) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getPrice() == price) {
				microoven[i] = null;
			}
		}
	}

	public MicroovenDto createObject(String brand, String color, int price, int capacity) {
		MicroovenDto microovenDto = new MicroovenDto(brand, color, price, capacity);
		return microovenDto;
	}

}
