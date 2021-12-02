package com.xworkz.interfaces.speaker;

import com.xworkz.interfaces.speaker.DTO.SpeakerDTO;
import com.xworkz.interfaces.speaker.service.SpeakerDtoService;
import com.xworkz.interfaces.speaker.service.SpeakerDtoServiceImpl;

public class Tester {
	public static void main(String[] args) {
		SpeakerDTO sony = new SpeakerDTO("Sony", 5000, "red", 14);
		SpeakerDtoService speakerDtoService = new SpeakerDtoServiceImpl();
		speakerDtoService.validateWatt(sony);
//		SpeakerDAOImpl dao = new SpeakerDAOImpl();
//		dao.saveSpeakerDto(sony);
//		
//		SpeakerDTO jbl = new SpeakerDTO("JBL", 10000, "Black", 100);
//		dao.saveSpeakerDto(jbl);

	}
}
