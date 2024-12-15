package com.xworkz.optical.things;

public class Optical {
		private String nameOfShop;
		private int noOflens;
		private String shopAddress;
		private int gstId;
		private String ownerName;
		
		
		public Optical(String nameOfShop,int noOflens,String shopAddress,int gstId,String ownerName){
			this.nameOfShop=nameOfShop;
			this.noOflens=noOflens;
			this.shopAddress=shopAddress;
			this.gstId=gstId;
			this.ownerName=ownerName;
		}
		
		public String toString() {
			return this.nameOfShop+" : Name Of Shop " +this.noOflens +": Number Of lens " +this.shopAddress +": Shop Address"
		+this.gstId+" : GST ID "+this.ownerName+": Owner Name"; 
		}
		
		
}
