package com.xworkz.electronicdevices.dto;

import java.util.Objects;

public class ElectronicDevicesDto {
		private String electronicDevices;
		private String warrantyProduct;
		private String productName;
		private String productType;
		private String brandOfProduct;
		private String proctNumber;
		
		public ElectronicDevicesDto() {
			System.out.println("------Electronic Divices--------------");
		}

		public ElectronicDevicesDto(String electronicDevices, String warrantyProduct, String productName,
				String productType, String brandOfProduct, String proctNumber) {
			super();
			this.electronicDevices = electronicDevices;
			this.warrantyProduct = warrantyProduct;
			this.productName = productName;
			this.productType = productType;
			this.brandOfProduct = brandOfProduct;
			this.proctNumber = proctNumber;
		}

		public String getElectronicDevices() {
			return electronicDevices;
		}

		public void setElectronicDevices(String electronicDevices) {
			this.electronicDevices = electronicDevices;
		}

		public String getWarrantyProduct() {
			return warrantyProduct;
		}

		public void setWarrantyProduct(String warrantyProduct) {
			this.warrantyProduct = warrantyProduct;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductType() {
			return productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getBrandOfProduct() {
			return brandOfProduct;
		}

		public void setBrandOfProduct(String brandOfProduct) {
			this.brandOfProduct = brandOfProduct;
		}

		public String getProctNumber() {
			return proctNumber;
		}

		public void setProctNumber(String proctNumber) {
			this.proctNumber = proctNumber;
		}

		@Override
		public int hashCode() {
			return Objects.hash(brandOfProduct, electronicDevices, proctNumber, productName, productType,
					warrantyProduct);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ElectronicDevicesDto other = (ElectronicDevicesDto) obj;
			return Objects.equals(brandOfProduct, other.brandOfProduct)
					&& Objects.equals(electronicDevices, other.electronicDevices)
					&& Objects.equals(proctNumber, other.proctNumber) && Objects.equals(productName, other.productName)
					&& Objects.equals(productType, other.productType)
					&& Objects.equals(warrantyProduct, other.warrantyProduct);
		}

		@Override
		public String toString() {
			return "ElectronicDevicesDto [electronicDevices=" + electronicDevices + ", warrantyProduct="
					+ warrantyProduct + ", productName=" + productName + ", productType=" + productType
					+ ", brandOfProduct=" + brandOfProduct + ", proctNumber=" + proctNumber + "]";
		}
		
		
}
