package com.xworkz.electronicdevices.service;

import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;
import com.xworkz.electronicdevices.repository.ElectronicDevicesRespository;
import com.xworkz.electronicdevices.repository.ElectronicDevicesRespositoryImplementation;
import com.xworkz.electronicdevices.util.ElectronicDevicesUtils;

public class ElectronicServiceImplementation implements ElectronicService{
	
	private ElectronicDevicesRespository eleRespository=new ElectronicDevicesRespositoryImplementation();
	
	@Override
	public boolean onSave(ElectronicDevicesDto dto) {
		System.out.println("dto"+dto);
		if(dto!=null) {
			if(ElectronicDevicesUtils.validate(dto.getBrandOfProduct())
					&& ElectronicDevicesUtils.validate(dto.getElectronicDevices())
					&& ElectronicDevicesUtils.validate(dto.getProctNumber())
					&& ElectronicDevicesUtils.validate(dto.getProductName())
					&& ElectronicDevicesUtils.validate(dto.getProductType())
					&& ElectronicDevicesUtils.validate(dto.getWarrantyProduct())
				) {
				if(!this.duplicateCheck(dto)) {
					System.out.println("No duplicate found");
					if(this.eleRespository.onSave(dto)) {
						return true;
					}
					else {
						System.out.println("Data is not saved");
					}
				} else {
					System.out.println("Duplicate data found");
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public ElectronicDevicesDto[] readData() {
		return this.eleRespository.readData();
	}

	@Override
	public boolean duplicateCheck(ElectronicDevicesDto dto) {
		ElectronicDevicesDto[] devicesDtos=this.eleRespository.readData();
		if(devicesDtos!=null) {
			for(ElectronicDevicesDto d:devicesDtos) {
				if(d!=null && d.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}
}
