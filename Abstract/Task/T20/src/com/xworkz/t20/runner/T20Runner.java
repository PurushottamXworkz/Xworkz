package com.xworkz.t20.runner;

import com.workz.t20.dto.T20Dto;
import com.xworkz.t20.service.T20Service;
import com.xworkz.t20.service.T20ServiceImplementation;

public class T20Runner {
	public static void main(String[] args) {
		T20Dto dto=new T20Dto();
		dto.setBoardName("BCCI");
		dto.setCaptainName("Virat");
		dto.setCountry("India");
		dto.setPlaceOfMatch("Melborne");
		dto.setTeamName("India");
		
		T20Service service=new T20ServiceImplementation();
		service.validateAndSave(dto);
		
		T20Dto dto2=new T20Dto();
		dto2.setBoardName("ICC");
		dto2.setCaptainName("Gangooly");
		dto2.setCountry("India");
		dto2.setPlaceOfMatch("Eden Garden");
		dto2.setTeamName("Team India");
		
		T20Service service2=new T20ServiceImplementation();
		service2.validateAndSave(dto2);
		
	}
}
