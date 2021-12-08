package com.xworkz.exception.geyser.dao;

import com.xworkz.exception.geyser.dto.GeyserDto;

public class GeyserDaoImpl implements GeyserDao {

	public GeyserDaoImpl() {
		System.out.println("Inside Dao");
	}

	GeyserDto geyser[] = new GeyserDto[3];
	int index = 0;

	@Override
	public void saveGeyserDto(GeyserDto dto) {
		geyser[index] = dto;
		index++;
	}

	@Override
	public void displayInfo() {
		for (int i = 0; i < geyser.length; i++) {
			if (geyser[i] != null) {
				System.out.println(geyser[i].getBrand());
				System.out.println(geyser[i].getPrice());
				System.out.println(geyser[i].getType());

			}
		}
	}

	@Override
	public void displayByBrand(String brand) {
		for (int i = 0; i < geyser.length; i++) {
			if (geyser[i].getBrand().equals(brand)) {
				System.out.println(geyser[i].getBrand());
				System.out.println(geyser[i].getPrice());
				System.out.println(geyser[i].getType());

			}
		}
	}

	@Override
	public void updatePriceByBrand(String brand, int newPrice) {
		for (int i = 0; i < geyser.length; i++) {
			if (geyser[i].getBrand().equals(brand)) {
				geyser[i].setPrice(newPrice);

			}
		}
	}

}
