package com.xworkz.electronicdevices.repository;

import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;

public interface ElectronicDevicesRespository {
		boolean onSave(ElectronicDevicesDto dto);
		ElectronicDevicesDto[] readData();
}
