package com.xworkz.dataTransfer_dataAccess.powerbank;

import com.xworkz.dataTransfer_dataAccess.powerbank.dao.PowerBankDAO;
import com.xworkz.dataTransfer_dataAccess.powerbank.dto.PowerBankDTO;

public class PowerBankTester {

	public static void main(String[] args) {
		System.out.println("Inside main");
		PowerBankDAO powerBankDAO = new PowerBankDAO();
		PowerBankDTO createPowerBank = powerBankDAO.createPowerBank("mi", 2000, 10000, "RED");
		powerBankDAO.displayPowerBankDTO(createPowerBank);
	}

}
