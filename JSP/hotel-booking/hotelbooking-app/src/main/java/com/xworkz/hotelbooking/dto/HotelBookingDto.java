package com.xworkz.hotelbooking.dto;

import java.util.Objects;

public class HotelBookingDto {
	private String name;
	private String email;
	private long contact;
	private long adharNumber;
	

	
	public void setName(String name) {
		this.name = name;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getContact() {
		return contact;
	}



	public long getAdharNumber() {
		return adharNumber;
	}



	@Override
	public String toString() {
		return "HotelBookingDto [name=" + name + ", email=" + email + ", contact=" + contact + ", adharNumber="
				+ adharNumber + "]";
	}

	

}
