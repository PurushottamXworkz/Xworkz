package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class BookingApplicationDetails {
		private String nameOfApp;
		private String bookingFor;
		private String bookedBy;
		private int noOfTickets;
		
		public BookingApplicationDetails() {
			System.out.println("This is default constructor");
		}
		
		public BookingApplicationDetails(String nameOfApp, String bookingFor, String bookedBy, int noOfTickets) {
			super();
			this.nameOfApp = nameOfApp;
			this.bookingFor = bookingFor;
			this.bookedBy = bookedBy;
			this.noOfTickets = noOfTickets;
		}
		

		public String getNameOfApp() {
			return nameOfApp;
		}

		public void setNameOfApp(String nameOfApp) {
			this.nameOfApp = nameOfApp;
		}

		public String getBookingFor() {
			return bookingFor;
		}

		public void setBookingFor(String bookingFor) {
			this.bookingFor = bookingFor;
		}

		public String getBookedBy() {
			return bookedBy;
		}

		public void setBookedBy(String bookedBy) {
			this.bookedBy = bookedBy;
		}

		public int getNoOfTickets() {
			return noOfTickets;
		}

		public void setNoOfTickets(int noOfTickets) {
			this.noOfTickets = noOfTickets;
		}

		@Override
		public String toString() {
			return "BookingApplicationDetails [nameOfApp=" + nameOfApp + ", bookingFor=" + bookingFor + ", bookedBy="
					+ bookedBy + ", noOfTickets=" + noOfTickets + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(bookedBy, bookingFor, nameOfApp, noOfTickets);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BookingApplicationDetails other = (BookingApplicationDetails) obj;
			return Objects.equals(bookedBy, other.bookedBy) && Objects.equals(bookingFor, other.bookingFor)
					&& Objects.equals(nameOfApp, other.nameOfApp) && noOfTickets == other.noOfTickets;
		}
		
		
		
		
		
		
}
