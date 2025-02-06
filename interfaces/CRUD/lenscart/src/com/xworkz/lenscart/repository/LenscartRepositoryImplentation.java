package com.xworkz.lenscart.repository;

import com.xworkz.lenscart.dto.LensCartdto;

public class LenscartRepositoryImplentation implements LensCartRepository{
	
	private LensCartdto[] dtos=new LensCartdto[2];
	private int index=0;
	
	
	@Override
	public boolean onSave(LensCartdto dto) {
		System.out.println("This is LensCart repo Implenetation");
		if(index<this.dtos.length) {
			this.dtos[this.index]=dto;
			this.index++;
			return true;
		}
		return false;
	}

	@Override
	public LensCartdto[] readData() {
		return dtos;
	}
	
	
}
