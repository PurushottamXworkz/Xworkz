package com.xworkz.complete_crud_operation.things;

import java.util.Objects;

public class LinkedInDetails {
	
	private String userid;
	private String name;
	private long contact;
	private String address;
	
	public LinkedInDetails() {
		System.out.println("This is default constructor");
	}

	

	public LinkedInDetails(String userid, String name, long contact, String address) {
		super();
		this.userid = userid;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}



	

	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getContact() {
		return contact;
	}



	public void setContact(long contact) {
		this.contact = contact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "LinkedInDetails [userid=" + userid + ", name=" + name + ", contact=" + contact + ", address=" + address
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contact, name, userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedInDetails other = (LinkedInDetails) obj;
		return Objects.equals(address, other.address) && Objects.equals(contact, other.contact)
				&& Objects.equals(name, other.name) && Objects.equals(userid, other.userid);
	}	
	
}
