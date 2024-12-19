package com.xworkz.userinformation.things;

import java.util.Objects;

public class UserInfo {
		String userName;
		String address;
		String firstName;
		String lastName;
		String email;
		long adharNum;
		long contact;
		String pancardNum;
		String password;
		int picode;
		String country;
		String state;
		String productName;
		int quantity;
		String voterID;
		
		public UserInfo(String userName, String address, String firstName, String lastName, String email, long adharNum,
				long contact, String pancardNum, String password, int picode, String country, String state,
				String productName, int quantity, String voterID) {
			super();
			this.userName = userName;
			this.address = address;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.adharNum = adharNum;
			this.contact = contact;
			this.pancardNum = pancardNum;
			this.password = password;
			this.picode = picode;
			this.country = country;
			this.state = state;
			this.productName = productName;
			this.quantity = quantity;
			this.voterID = voterID;
		}

		@Override
		public String toString() {
			return "UserInfo [userName=" + userName + ", address=" + address + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", email=" + email + ", adharNum=" + adharNum + ", contact=" + contact
					+ ", pancardNum=" + pancardNum + ", password=" + password + ", picode=" + picode + ", country="
					+ country + ", state=" + state + ", productName=" + productName + ", quantity=" + quantity
					+ ", voterID=" + voterID + "]";
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserInfo other = (UserInfo) obj;
			return Objects.equals(address, other.address) && adharNum == other.adharNum && contact == other.contact
					&& Objects.equals(country, other.country) && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
					&& Objects.equals(pancardNum, other.pancardNum) && Objects.equals(password, other.password)
					&& picode == other.picode && Objects.equals(productName, other.productName)
					&& quantity == other.quantity && Objects.equals(state, other.state)
					&& Objects.equals(userName, other.userName) && Objects.equals(voterID, other.voterID);
		}
		
		
		
		
}
