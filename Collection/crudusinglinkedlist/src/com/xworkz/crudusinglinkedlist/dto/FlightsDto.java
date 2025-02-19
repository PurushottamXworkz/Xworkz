package com.xworkz.crudusinglinkedlist.dto;

import java.util.Objects;

public class FlightsDto {
		private String typeOfFlight;
		private String nameOfflight;
		private String nameOfCosmopolitan;
		private long contact;
		
		public FlightsDto(String typeOfFlight, String nameOfflight, String nameOfCosmopolitan, long contact) {
			super();
			this.typeOfFlight = typeOfFlight;
			this.nameOfflight = nameOfflight;
			this.nameOfCosmopolitan = nameOfCosmopolitan;
			this.contact = contact;
		}
		
		public String getTypeOfFlight() {
			return typeOfFlight;
		}

		public void setTypeOfFlight(String typeOfFlight) {
			this.typeOfFlight = typeOfFlight;
		}

		public String getNameOfflight() {
			return nameOfflight;
		}

		public void setNameOfflight(String nameOfflight) {
			this.nameOfflight = nameOfflight;
		}

		public String getNameOfCosmopolitan() {
			return nameOfCosmopolitan;
		}

		public void setNameOfCosmopolitan(String nameOfCosmopolitan) {
			this.nameOfCosmopolitan = nameOfCosmopolitan;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		@Override
		public int hashCode() {
			return Objects.hash(contact, nameOfCosmopolitan, nameOfflight, typeOfFlight);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FlightsDto other = (FlightsDto) obj;
			return contact == other.contact && Objects.equals(nameOfCosmopolitan, other.nameOfCosmopolitan)
					&& Objects.equals(nameOfflight, other.nameOfflight)
					&& Objects.equals(typeOfFlight, other.typeOfFlight);
		}

		@Override
		public String toString() {
			return "FlightsDto [typeOfFlight=" + typeOfFlight + ", nameOfflight=" + nameOfflight
					+ ", nameOfCosmopolitan=" + nameOfCosmopolitan + ", contact=" + contact + "]";
		}

		
}
