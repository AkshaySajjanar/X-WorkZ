package com.xworkz.interfaces.speaker.service;

import com.xworkz.interfaces.speaker.DAO.SpeakerDAO;
import com.xworkz.interfaces.speaker.DAO.SpeakerDAOImpl;
import com.xworkz.interfaces.speaker.DTO.SpeakerDTO;

public class SpeakerDtoServiceImpl implements SpeakerDtoService {

	boolean status = true;

	SpeakerDAO dao = new SpeakerDAOImpl();

	public SpeakerDtoServiceImpl() {
		System.out.println("");
	}

	@Override
	public boolean validateWatt(SpeakerDTO dto) {
		if (dto.getBrand().length() < 4 || dto.getBrand().isEmpty()) {
			System.out.println("Enter a valid brand name");
		} else {
			return status;
		}

		if (dto.getWatt() > 15) {
			return status;
		} else {
			System.out.println("Please enter valid watt");

		}

		if (dto.getPrice() > 10000) {

			return status = true;
		} else {
			System.out.println("Please enter valid price");
		}
		if (dto.getColor().length() < 4 || dto.getColor().isEmpty()) {
			System.out.println("Enter a valid color");
		} else {
			return status;
		}

		if (status == true) {
			dao.saveSpeakerDto(dto);
		}
		return status;
	}

}
