package com.xworkz.exception.geyser.service;

import com.xworkz.exception.geyser.dao.GeyserDaoImpl;
import com.xworkz.exception.geyser.dto.GeyserDto;
import com.xworkz.exception.geyser.exception.InvalidBrand;
import com.xworkz.exception.geyser.exception.InvalidPrice;
import com.xworkz.exception.geyser.exception.InvalidType;

public class GeyserDtoServiceImpl implements GeyserDtoService {

	GeyserDaoImpl geyser = new GeyserDaoImpl();

	public void validateSave(GeyserDto obj) throws InvalidBrand {

		if (obj.getBrand() == null || obj.getBrand().length() < 4) {
			InvalidBrand invalidBrand = new InvalidBrand("Invalid brand");
			throw invalidBrand;
		}
		if (obj.getPrice() == 0) {
			InvalidPrice invalidPrice = new InvalidPrice("Invalid Price");
			throw invalidPrice;
		}
		if (obj.getType().isEmpty()) {
			InvalidType invalidType = new InvalidType("Invalid Type");
			throw invalidType;
		}

	}
}
