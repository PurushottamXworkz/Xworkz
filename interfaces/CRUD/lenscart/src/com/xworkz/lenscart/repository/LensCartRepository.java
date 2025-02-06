package com.xworkz.lenscart.repository;

import com.xworkz.lenscart.dto.LensCartdto;

public interface LensCartRepository {
	boolean onSave(LensCartdto dto);
	LensCartdto[] readData();
}
