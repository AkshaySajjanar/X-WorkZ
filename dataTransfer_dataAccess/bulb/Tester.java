package com.xworkz.dataTransfer_dataAccess.bulb;

import com.xworkz.dataTransfer_dataAccess.bulb.dao.BulbDao;
import com.xworkz.dataTransfer_dataAccess.bulb.dto.BulbDTO;

public class Tester {

	public static void main(String[] args) {

		BulbDao bulbDao = new BulbDao();
		BulbDTO createBulbDto = bulbDao.createBulbDto(123456, "Philips", 123, 30, "blue");
		bulbDao.displayBulbDTO(createBulbDto);

	}

}
