package com.xworkz.complete_crud_operation.things;

import java.util.Objects;

public class PersonDetails {
		private String personName;
		private String address;
		private String state;
		private String country;
		
		public PersonDetails() {
			System.out.println("This is default constructor");
		}

		public PersonDetails(String personName, String address, String state, String country) {
			super();
			this.personName = personName;
			this.address = address;
			this.state = state;
			this.country = country;
		}

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "PersonDetails [personName=" + personName + ", address=" + address + ", state=" + state
					+ ", country=" + country + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(address, country, personName, state);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PersonDetails other = (PersonDetails) obj;
			return Objects.equals(address, other.address) && Objects.equals(country, other.country)
					&& Objects.equals(personName, other.personName) && Objects.equals(state, other.state);
		}
		
			
		
}
