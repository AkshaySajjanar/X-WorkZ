package com.xworkz.dataTransfer_dataAccess.bulb.dao;

import com.xworkz.dataTransfer_dataAccess.bulb.dto.BulbDTO;

public class BulbDao {
	public BulbDao() {
		System.out.println("Inside DAO constructor");
	}

	public BulbDTO createBulbDto(int serialNumber, String brand, int price, int volt, String color) {
		System.out.println("Inside a create method");
		BulbDTO bulbDTO = new BulbDTO(serialNumber, brand, price, volt, color);
		return bulbDTO;
	}

	public void displayBulbDTO(BulbDTO dto) {
		System.out.println("Inside the display method");
		System.out.println(dto.getSerialNumber());
		System.out.println(dto.getBrand());
		System.out.println(dto.getPrice());
		System.out.println(dto.getVolt());
	}

}
