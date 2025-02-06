package com.xworkz.electronicdevices.repository;

import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;

public class ElectronicDevicesRespositoryImplementation implements ElectronicDevicesRespository{

	private ElectronicDevicesDto[] devicesDto=new ElectronicDevicesDto[2]; 	
	int index=0;
	@Override
	public boolean onSave(ElectronicDevicesDto dto) {
		if(this.index<this.devicesDto.length) {
			this.devicesDto[index]=dto;
			this.index++;
			return true;
		}
		return false;
	}

	@Override
	public ElectronicDevicesDto[] readData() {
		return this.devicesDto;
	}

	

	

}
