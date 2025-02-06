package com.xworkz.lenscart.runner;

import com.xworkz.lenscart.constant.LensFrame;
import com.xworkz.lenscart.constant.LensType;
import com.xworkz.lenscart.constant.OrderType;
import com.xworkz.lenscart.constant.VarientsOfLens;
import com.xworkz.lenscart.dto.LensCartdto;
import com.xworkz.lenscart.service.LensCartService;
import com.xworkz.lenscart.service.LensCartServiceImplementaion;

public class LensCartRunner {
	public static void main(String[] args) {
		
		LensCartdto dto=new LensCartdto();
		dto.setBrandOfFrame("Vincent Frame");
		dto.setLensType(LensType.ADULT.toString());
		dto.setLensFrame(LensFrame.CLUBMASTER.toString());
		dto.setOrderType(OrderType.IN_STORE.toString());
		dto.setStoreLocation("Bangalore");
		dto.setVarientsOfLens(VarientsOfLens.READING_GLASSES.toString());
		
		LensCartService service=new LensCartServiceImplementaion();
		if(service.onSave(dto)) {
			System.out.println("Validation is Succesfull");
		}else {
			System.out.println("Validation is not successfull");
		}
		
		System.out.println("Read Data");
		LensCartdto[] dtos=service.readData();
		for(LensCartdto d:dtos) {
			System.out.println(d);
		}
	}
}
