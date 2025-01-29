package com.xworkz.t20.service;

import com.workz.t20.dto.T20Dto;

public class T20ServiceImplementation extends T20Service{
	
	T20Dto[] dtos=new T20Dto[3];
	int index=0;
	
	public String validateAndSave(T20Dto dto) {
		if (dto != null) {
			if (dto.getCaptainName() != null && dto.getCaptainName().length() > 3) {
				System.out.println("Captain data is validated and saved");
			} else {
				System.err.println("Not validated Data");
			}
			if (dto.getBoardName() != null && dto.getBoardName().length() > 0) {
				System.out.println("Board Name is validated and saved");
			} else {
				System.err.println("Not validated Data");
			}
			if (dto.getCountry() != null && dto.getCountry().length() > 3) {
				System.out.println("Country data is validated and Saved");
			} else {
				System.err.println("Not validated Data");
			}
			if (dto.getPlaceOfMatch() != null && dto.getPlaceOfMatch().length() > 3) {
				System.out.println("Place of match is validated and Saved");
			} else {
				System.err.println("Not validated Data");
			}
			if (dto.getTeamName() != null && dto.getTeamName().length() > 3) {
				System.out.println("Team name is validated and Saved");
			} else {
				System.err.println("Not validated Data");
			}
			boolean resultSave=this.onSave(dto);
			if(resultSave==true) {
				System.out.println("Saved T20 successfully");
			}else {
				System.out.println("Not saved");
			}
			
		}
		return "Data is Null";
	}
	
	public boolean onSave(T20Dto dto) {
		System.out.println("Save method invoke");
		if(this.index<dtos.length) {
			dtos[this.index]=dto;
			this.index++;
			return true;
		}
		return false;
	}
	
}
