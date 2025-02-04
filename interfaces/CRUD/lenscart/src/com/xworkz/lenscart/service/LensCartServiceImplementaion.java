package com.xworkz.lenscart.service;

import com.xworkz.lenscart.dto.LensCartdto;
import com.xworkz.lenscart.util.LensCartUtils;

public class LensCartServiceImplementaion implements LensCartService{
	@Override
	public boolean onSave(LensCartdto dto) {
		
		System.out.println("----Serive Implementation-----");
		System.out.println("dto"+dto);
		if(dto!=null) {
			if(LensCartUtils.validate(dto.getBrandOfFrame())
					&& LensCartUtils.validate(dto.getLensFrame())
					&& LensCartUtils.validate(dto.getLensType())
					&& LensCartUtils.validate(dto.getOrderType())
					&& LensCartUtils.validate(dto.getStoreLocation())
					&& LensCartUtils.validate(dto.getVarientsOfLens())
					) {
				return true;
			}
		}
		return false;
	}
	
}
