package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class ShopsDetails {
	private String shopName;
	private String ownerName;
	private String address;
	private long contact;
	
	
	public ShopsDetails() {
		System.out.println("This is default constructor");
	}
	
	public ShopsDetails(String shopName, String ownerName, String address, long contact) {
		super();
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.address = address;
		this.contact = contact;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
		return "ShopsDetails [shopName=" + shopName + ", ownerName=" + ownerName + ", address=" + address + ", contact="
				+ contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contact, ownerName, shopName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopsDetails other = (ShopsDetails) obj;
		return Objects.equals(address, other.address) && contact == other.contact
				&& Objects.equals(ownerName, other.ownerName) && Objects.equals(shopName, other.shopName);
	}
	
	
	
}
