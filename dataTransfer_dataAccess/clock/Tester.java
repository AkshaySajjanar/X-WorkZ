package com.xworkz.dataTransfer_dataAccess.clock;

import com.xworkz.dataTransfer_dataAccess.clock.dao.ClockDao;
import com.xworkz.dataTransfer_dataAccess.clock.dto.ClockDto;

public class Tester {

	public static void main(String[] args) {

		ClockDao clockDao = new ClockDao();
		ClockDto titan = clockDao.createObject("Titan", 2000, "Analog", "Silver");
		clockDao.saveDto(titan);

		ClockDto fasttrack = clockDao.createObject("Fasttrack", 4500, "Digital", "Black");
		clockDao.saveDto(fasttrack);

		ClockDto fossil = clockDao.createObject("Fossil", 10000, "Digital", "Gold");
		clockDao.saveDto(fossil);

		ClockDto casio = clockDao.createObject("Casio", 1500, "Analog", "Grey");
		clockDao.saveDto(casio);

		clockDao.displayInfo();
		
		clockDao.displayByBrandName("Fossil");
		
		clockDao.updateTypeByBrandName("Fossil", "Analog");
		clockDao.displayByBrandName("Fossil");
		
		clockDao.deleteByBrandName("Casio");
		clockDao.displayInfo();
		
	}

}
