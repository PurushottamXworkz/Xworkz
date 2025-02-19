package com.xworkz.crudusingarraylist.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.crudusingarraylist.dto.BigBazarDto;

public class BigBazarRunner {
	public static void main(String[] args) {
		List<BigBazarDto> bazarDtos=new ArrayList<BigBazarDto>();
		
		bazarDtos.add(new BigBazarDto("pampers", "Vinayak", 45.9f, "item234"));
		bazarDtos.add(new BigBazarDto("shell", "Vinayak", 20.0f, "item236"));
		bazarDtos.add(new BigBazarDto("Veggies", "Vinayak", 100.99f, "item239"));
		bazarDtos.add(new BigBazarDto("Brush", "Vinayak", 25.0f, "item230"));
		
		System.out.println(bazarDtos);
		bazarDtos.remove(1);
		System.out.println(bazarDtos);
		bazarDtos.set(1, new BigBazarDto("charger", "prashant", 58.5f, "item5671"));
		System.out.println(bazarDtos);
		bazarDtos.remove(2);
		System.out.println(bazarDtos);
		
		
	}
}
