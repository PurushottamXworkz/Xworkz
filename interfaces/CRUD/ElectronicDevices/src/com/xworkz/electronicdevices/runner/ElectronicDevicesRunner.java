package com.xworkz.electronicdevices.runner;

import com.xworkz.electronicdevices.constant.BrandOfProduct;
import com.xworkz.electronicdevices.constant.ElectronicDevices;
import com.xworkz.electronicdevices.constant.ProductType;
import com.xworkz.electronicdevices.dto.ElectronicDevicesDto;
import com.xworkz.electronicdevices.service.ElectronicService;
import com.xworkz.electronicdevices.service.ElectronicServiceImplementation;

public class ElectronicDevicesRunner {
	public static void main(String[] args) {
		ElectronicDevicesDto dto=new ElectronicDevicesDto();
		dto.setBrandOfProduct(BrandOfProduct.DELL.toString());
		dto.setElectronicDevices(ElectronicDevices.WASHING_MACHINE.toString());
		dto.setProctNumber("Wash-Machine123");
		dto.setProductName("Washing Machine");
		dto.setProductType(ProductType.ORIGINAL.toString());
		dto.setWarrantyProduct("Yes");
		
		ElectronicDevicesDto dto1=new ElectronicDevicesDto();
		dto1.setBrandOfProduct(BrandOfProduct.DELL.toString());
		dto1.setElectronicDevices(ElectronicDevices.WASHING_MACHINE.toString());
		dto1.setProctNumber("Wash-Machine123");
		dto1.setProductName("Washing Machine");
		dto1.setProductType(ProductType.ORIGINAL.toString());
		dto1.setWarrantyProduct("Yes");
		
		
		ElectronicService service=new ElectronicServiceImplementation();
		if(service.onSave(dto)) {
			System.out.println("Validation is succesfull");
		}else {
			System.out.println("Validation is not succesfull");
		}
		
		if(service.onSave(dto1)) {
			System.out.println("Validation is succesfull");
		}else {
			System.out.println("Validation is not succesfull");
		}
		
		System.out.println("Read");
		ElectronicDevicesDto[]  dtos=service.readData();
		for(ElectronicDevicesDto d:dtos) {
			System.out.println(d);
		}
	}
}
