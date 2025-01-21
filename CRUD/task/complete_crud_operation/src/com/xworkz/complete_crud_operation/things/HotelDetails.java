package com.xworkz.complete_crud_operation.things;

import java.util.Objects;

public class HotelDetails {
	
     private int noOfRooms;
     private String nameOfHotel;
     private String idProof;
     private String nameOfCustomer;
     
     public HotelDetails() {
		System.out.println("This is default constructor");
	 }

	public HotelDetails(int noOfRooms, String nameOfHotel, String idProof, String nameOfCustomer) {
		super();
		this.noOfRooms = noOfRooms;
		this.nameOfHotel = nameOfHotel;
		this.idProof = idProof;
		this.nameOfCustomer = nameOfCustomer;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getNameOfHotel() {
		return nameOfHotel;
	}

	public void setNameOfHotel(String nameOfHotel) {
		this.nameOfHotel = nameOfHotel;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	@Override
	public String toString() {
		return "HotelDetails [noOfRooms=" + noOfRooms + ", nameOfHotel=" + nameOfHotel + ", idProof=" + idProof
				+ ", nameOfCustomer=" + nameOfCustomer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProof, nameOfCustomer, nameOfHotel, noOfRooms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDetails other = (HotelDetails) obj;
		return Objects.equals(idProof, other.idProof) && Objects.equals(nameOfCustomer, other.nameOfCustomer)
				&& Objects.equals(nameOfHotel, other.nameOfHotel) && noOfRooms == other.noOfRooms;
	}
     
     
     
}
