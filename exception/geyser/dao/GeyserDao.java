package com.xworkz.exception.geyser.dao;

import com.xworkz.exception.geyser.dto.GeyserDto;

public interface GeyserDao {

	public void saveGeyserDto(GeyserDto dto);
	public void displayInfo();
	public void displayByBrand(String brand);
	public void updatePriceByBrand(String brand, int newPrice);
}
