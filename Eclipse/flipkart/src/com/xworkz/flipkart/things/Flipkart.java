package com.xworkz.flipkart.things;

public class Flipkart {
		private String orderBy;
		private int orderId;
		private String address;
		private int quntity;
		private int otp;
		

		public Flipkart(String orderBy, int orderId, String address, int quntity, int otp) {
			this.orderBy = orderBy;
			this.orderId = orderId;
			this.address = address;
			this.quntity = quntity;
			this.otp = otp;
		}
		
		public String toString() {
			return this.orderBy +": Order By "+this.orderId +" : Order ID "+ this.address+": Address " 
		+this.quntity+": Quantity" + this.otp +": OTP";
		}
}
