package com.xworkz.digilocker.service;

import com.xworkz.digilocker.dto.DigilockerDto;

public abstract class DigilockerService {
	
	public abstract String validateAndSave(DigilockerDto dto);
}
