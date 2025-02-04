package com.xworkz.electronicdevices.service;

import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;
import com.xworkz.electronicdevices.util.ElectronicDevicesUtils;

public class ElectronicServiceImplementation implements ElectronicService{

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
				return true;
			}
		}
		return false;
	}

}
