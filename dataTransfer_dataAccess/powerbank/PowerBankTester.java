package com.xworkz.dataTransfer_dataAccess.powerbank;

import com.xworkz.dataTransfer_dataAccess.powerbank.dao.PowerBankDAO;
import com.xworkz.dataTransfer_dataAccess.powerbank.dto.PowerBankDTO;

public class PowerBankTester {

	public static void main(String[] args) {
		System.out.println("Inside main");
		PowerBankDAO powerBankDAO = new PowerBankDAO();
		PowerBankDTO mi = powerBankDAO.createPowerBank("mi", 2000, 10000, "RED");
		PowerBankDTO sony = powerBankDAO.createPowerBank("Sony", 1800, 5000, "BLACK");
		PowerBankDTO intel = powerBankDAO.createPowerBank("iNTEL", 1600, 10000, "GREEN");
		PowerBankDTO syska = powerBankDAO.createPowerBank("Syska", 1500, 10000, "BLUE");

		powerBankDAO.displayPowerBankDTO(mi);
		powerBankDAO.displayPowerBankDTO(sony);
		powerBankDAO.displayPowerBankDTO(intel);
		powerBankDAO.displayPowerBankDTO(syska);
		
		PowerBankDTO updatePowerBank = powerBankDAO.updatePowerBank(syska, 1000);
		powerBankDAO.displayPowerBankDTO(updatePowerBank);
	}

}
