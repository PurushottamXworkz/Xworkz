package com.xworkz.crudusingarraylist.dto;

import java.util.Objects;

public class BigBazarDto {
	
	private String itemName;
	private String nameOfCustomer;
	private float bill;
	private String billNumber;
	
	public BigBazarDto(String itemName, String nameOfCustomer, float bill, String billNumber) {
		super();
		this.itemName = itemName;
		this.nameOfCustomer = nameOfCustomer;
		this.bill = bill;
		this.billNumber = billNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bill, billNumber, itemName, nameOfCustomer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BigBazarDto other = (BigBazarDto) obj;
		return Float.floatToIntBits(bill) == Float.floatToIntBits(other.bill)
				&& Objects.equals(billNumber, other.billNumber) && Objects.equals(itemName, other.itemName)
				&& Objects.equals(nameOfCustomer, other.nameOfCustomer);
	}

	@Override
	public String toString() {
		return "BigBazarDto [itemName=" + itemName + ", nameOfCustomer=" + nameOfCustomer + ", bill=" + bill
				+ ", billNumber=" + billNumber + "]";
	}
	
}
