package com.xworkz.electronicdevices.service;

import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;

public interface ElectronicService {
	boolean onSave(ElectronicDevicesDto dto);
	ElectronicDevicesDto[] readData();
	boolean duplicateCheck(ElectronicDevicesDto dto);
}
