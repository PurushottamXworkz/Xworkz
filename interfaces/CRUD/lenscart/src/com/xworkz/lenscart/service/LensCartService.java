package com.xworkz.lenscart.service;

import com.xworkz.lenscart.dto.LensCartdto;

public interface LensCartService {
		boolean onSave(LensCartdto dto);
		LensCartdto[] readData();
		boolean duplicateCheck(LensCartdto dto);
}
