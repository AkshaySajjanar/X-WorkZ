package com.xworkz.dataTransfer_dataAccess.powerbank.dao;

import com.xworkz.dataTransfer_dataAccess.powerbank.dto.PowerBankDTO;

public class PowerBankDAO {

	public PowerBankDAO() {
		System.out.println("Inside powerbank DAO");

	}

	public void displayPowerBankDTO(PowerBankDTO dto) {
		System.out.println("Inside the display method");
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());
		System.out.println(dto.getmAh());
	}
	
	public PowerBankDTO createPowerBank(String brand, int price, int mAh, String color) {
		System.out.println("Inside create method");
		PowerBankDTO powerBankDTO = new PowerBankDTO(brand, price, mAh, color);
		return powerBankDTO;
	}
	
	public PowerBankDTO updatePowerBank(PowerBankDTO obj, int newPrice) {
		System.out.println("Inside update methods");
		obj.setPrice(newPrice);
		return obj;
	}

	
	

}
