package com.xworkz.exception.geyser;

import com.xworkz.exception.geyser.dto.GeyserDto;
import com.xworkz.exception.geyser.service.GeyserDtoServiceImpl;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Start of program");
		GeyserDto geyserDto = new GeyserDto("Ush", 12000, "Electric");
		GeyserDtoServiceImpl geyserDtoServiceImpl = new GeyserDtoServiceImpl();
		geyserDtoServiceImpl.validateSave(geyserDto);
		System.out.println("End of program");
	}
}
