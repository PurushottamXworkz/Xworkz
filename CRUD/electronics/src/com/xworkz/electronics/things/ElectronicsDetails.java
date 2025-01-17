package com.xworkz.electronics.things;

import java.util.Objects;

public class ElectronicsDetails {
		private int noOfItems;
		private String nameOfElectronic;
		private String brandName;
		private String distributionName;
			
				
		public ElectronicsDetails() {
			System.out.println("This is default constructor");
		}
		
		public ElectronicsDetails(int noOfItems, String nameOfElectronic, String brandName, String distributionName) {
			super();
			this.noOfItems = noOfItems;
			this.nameOfElectronic = nameOfElectronic;
			this.brandName = brandName;
			this.distributionName = distributionName;
		}
		
		public int getNoOfItems() {
			return noOfItems;
		}
		public void setNoOfItems(int noOfItems) {
			this.noOfItems = noOfItems;
		}
		public String getNameOfElectronic() {
			return nameOfElectronic;
		}
		public void setNameOfElectronic(String nameOfElectronic) {
			this.nameOfElectronic = nameOfElectronic;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getDistributionName() {
			return distributionName;
		}
		public void setDistributionName(String distributionName) {
			this.distributionName = distributionName;
		}
		
		@Override
		public String toString() {
			return "ElectronicsDetails [noOfItems=" + noOfItems + ", nameOfElectronic=" + nameOfElectronic
					+ ", brandName=" + brandName + ", distributionName=" + distributionName + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(brandName, distributionName, nameOfElectronic, noOfItems);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ElectronicsDetails other = (ElectronicsDetails) obj;
			return Objects.equals(brandName, other.brandName)
					&& Objects.equals(distributionName, other.distributionName)
					&& Objects.equals(nameOfElectronic, other.nameOfElectronic) && noOfItems == other.noOfItems;
		}
		
		
		
		
		
}
