package com.xworkz.dataTransfer_dataAccess.ironbox.dao;

import com.xworkz.dataTransfer_dataAccess.ironbox.dto.IronboxDto;

public class IronboxDao {

	public IronboxDao() {
		System.out.println("Inside ironbox dao");
	}

	IronboxDto ironbox[] = new IronboxDto[3];
	int index = 0;

	public void saveDto(IronboxDto obj) {
		ironbox[index] = obj;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i] != null) {
				System.out.println(ironbox[i].getBrand());
				System.out.println(ironbox[i].getSerialNumber());
				System.out.println(ironbox[i].getWatt());
				System.out.println("---------------");

			}
		}
	}

	public void displayByBrandName(String brand) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(brand)) {
				System.out.println(ironbox[i].getBrand());
				System.out.println(ironbox[i].getSerialNumber());
				System.out.println(ironbox[i].getWatt());
				System.out.println("---------------");
			}
		}
	}

	public void updateWattByBrandName(String brand, int newWatt) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(brand)) {
				ironbox[i].setWatt(newWatt);
			}
		}

	}

	public void deleteBySerialNumber(int serialNumber) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getSerialNumber() == serialNumber) {
				ironbox[i] = null;
			}
		}
	}

	public IronboxDto createObj(String brand, int serialNumber, int watt) {
		IronboxDto ironboxDto = new IronboxDto(brand, serialNumber, watt);
		return ironboxDto;

	}
}
