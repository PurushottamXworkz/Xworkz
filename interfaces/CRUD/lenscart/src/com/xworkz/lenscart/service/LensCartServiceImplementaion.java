package com.xworkz.lenscart.service;

import com.xworkz.lenscart.dto.LensCartdto;
import com.xworkz.lenscart.repository.LensCartRepository;
import com.xworkz.lenscart.repository.LenscartRepositoryImplentation;
import com.xworkz.lenscart.util.LensCartUtils;

public class LensCartServiceImplementaion implements LensCartService{
	private LensCartRepository repository=new LenscartRepositoryImplentation();
	
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
				System.out.println("Validation done");
				if(!this.duplicateCheck(dto)) {
					if(this.repository.onSave(dto)) {
						System.out.println("Saved successfully");
						return true;
					}else {
						System.out.println("Not saved");
						return true;
					}
				}else {
					System.out.println("Duplicate Dto");
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public LensCartdto[] readData() {
		return this.repository.readData();
	}

	@Override
	public boolean duplicateCheck(LensCartdto dto) {
		LensCartdto[] cartdtos=this.repository.readData();
		if(cartdtos!=null) {
			for(LensCartdto d:cartdtos) {
				if(d!=null && d.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
