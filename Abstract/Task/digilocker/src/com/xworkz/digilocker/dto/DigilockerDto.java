package com.xworkz.digilocker.dto;

import java.util.Objects;

public class DigilockerDto {
		private String nameOfPerson;
		private String password;
		private String address;
		private String dateOfBirth;
		private String placeOfBirth;
		
		public DigilockerDto() {
			System.out.println("-----------------------Constructor------------------------");
		}

		public DigilockerDto(String nameOfPerson, String password, String address, String dateOfBirth,
				String placeOfBirth) {
			super();
			this.nameOfPerson = nameOfPerson;
			this.password = password;
			this.address = address;
			this.dateOfBirth = dateOfBirth;
			this.placeOfBirth = placeOfBirth;
		}

		public String getNameOfPerson() {
			return nameOfPerson;
		}

		public void setNameOfPerson(String nameOfPerson) {
			this.nameOfPerson = nameOfPerson;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getPlaceOfBirth() {
			return placeOfBirth;
		}

		public void setPlaceOfBirth(String placeOfBirth) {
			this.placeOfBirth = placeOfBirth;
		}

		@Override
		public int hashCode() {
			return Objects.hash(address, dateOfBirth, nameOfPerson, password, placeOfBirth);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DigilockerDto other = (DigilockerDto) obj;
			return Objects.equals(address, other.address) && Objects.equals(dateOfBirth, other.dateOfBirth)
					&& Objects.equals(nameOfPerson, other.nameOfPerson) && Objects.equals(password, other.password)
					&& Objects.equals(placeOfBirth, other.placeOfBirth);
		}
		
		
		
}
