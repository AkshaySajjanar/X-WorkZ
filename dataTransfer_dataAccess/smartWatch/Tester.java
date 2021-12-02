package com.xworkz.dataTransfer_dataAccess.smartWatch;

import com.xworkz.dataTransfer_dataAccess.smartWatch.dao.SmartWatchDaoImpl;

public class Tester {

	public static void main(String[] args) {

		SmartWatchDaoImpl noise = new SmartWatchDaoImpl(454545, "Noise", "Grey", 10000);
		noise.saveDTO(noise);

		SmartWatchDaoImpl fossil = new SmartWatchDaoImpl(78889, "fossil", "Black", 10000);
		fossil.saveDTO(fossil);

		SmartWatchDaoImpl oneplus = new SmartWatchDaoImpl(45654, "Oneplus", "Silver", 15000);
		oneplus.saveDTO(oneplus);

		SmartWatchDaoImpl mi = new SmartWatchDaoImpl(123254, "MI", "Black", 2000);
		mi.saveDTO(mi);

		SmartWatchDaoImpl samsung = new SmartWatchDaoImpl(145620, "Smasung", "red", 20000);
		samsung.saveDTO(samsung);

		samsung.displayInfo();

	}
}
