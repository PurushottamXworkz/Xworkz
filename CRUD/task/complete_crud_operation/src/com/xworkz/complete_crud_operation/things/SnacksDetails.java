package com.xworkz.complete_crud_operation.things;

import java.util.Objects;

public class SnacksDetails {
	
	private int noOfScacks;
	private String nameOfSnack;
	private String nameOfShop;
	private long contact;
	
	public SnacksDetails() {
		System.out.println("This is default constructor");
	}

	public SnacksDetails(int noOfScacks, String nameOfSnack, String nameOfShop, long contact) {
		super();
		this.noOfScacks = noOfScacks;
		this.nameOfSnack = nameOfSnack;
		this.nameOfShop = nameOfShop;
		this.contact = contact;
	}

	public int getNoOfScacks() {
		return noOfScacks;
	}

	public void setNoOfScacks(int noOfScacks) {
		this.noOfScacks = noOfScacks;
	}

	public String getNameOfSnack() {
		return nameOfSnack;
	}

	public void setNameOfSnack(String nameOfSnack) {
		this.nameOfSnack = nameOfSnack;
	}

	public String getNameOfShop() {
		return nameOfShop;
	}

	public void setNameOfShop(String nameOfShop) {
		this.nameOfShop = nameOfShop;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "SnacksDetails [noOfScacks=" + noOfScacks + ", nameOfSnack=" + nameOfSnack + ", nameOfShop=" + nameOfShop
				+ ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact, nameOfShop, nameOfSnack, noOfScacks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnacksDetails other = (SnacksDetails) obj;
		return contact == other.contact && Objects.equals(nameOfShop, other.nameOfShop)
				&& Objects.equals(nameOfSnack, other.nameOfSnack) && noOfScacks == other.noOfScacks;
	}
		
	
}
