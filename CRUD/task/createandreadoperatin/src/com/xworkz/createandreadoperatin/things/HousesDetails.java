package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class HousesDetails {
	private String nameOfHouse;
	private String ownedBy;
	private String address;
	private long contact;
	
	public HousesDetails() {
		System.out.println("This is default constructor");
	}
	
	public HousesDetails(String nameOfHouse, String ownedBy, String address, long contact) {
		super();
		this.nameOfHouse = nameOfHouse;
		this.ownedBy = ownedBy;
		this.address = address;
		this.contact = contact;
	}

	public String getNameOfHouse() {
		return nameOfHouse;
	}

	public void setNameOfHouse(String nameOfHouse) {
		this.nameOfHouse = nameOfHouse;
	}

	public String getOwnedBy() {
		return ownedBy;
	}

	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "HousesDetails [nameOfHouse=" + nameOfHouse + ", ownedBy=" + ownedBy + ", address=" + address
				+ ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contact, nameOfHouse, ownedBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HousesDetails other = (HousesDetails) obj;
		return Objects.equals(address, other.address) && contact == other.contact
				&& Objects.equals(nameOfHouse, other.nameOfHouse) && Objects.equals(ownedBy, other.ownedBy);
	}
		
	
}
