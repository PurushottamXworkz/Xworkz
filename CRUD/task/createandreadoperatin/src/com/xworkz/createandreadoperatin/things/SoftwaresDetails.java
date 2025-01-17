package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class SoftwaresDetails {
	
	private String nameOfSoft;
	private String developedBy;
	private String version;
	private int productCost;
	
	public SoftwaresDetails() {
		System.out.println("This is default constructor");
	}
	
	
	public SoftwaresDetails(String nameOfSoft, String developedBy, String version, int productCost) {
		super();
		this.nameOfSoft = nameOfSoft;
		this.developedBy = developedBy;
		this.version = version;
		this.productCost = productCost;
	}


	public String getNameOfSoft() {
		return nameOfSoft;
	}
	public void setNameOfSoft(String nameOfSoft) {
		this.nameOfSoft = nameOfSoft;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "SoftwaresDetails [nameOfSoft=" + nameOfSoft + ", developedBy=" + developedBy + ", version=" + version
				+ ", productCost=" + productCost + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(developedBy, nameOfSoft, productCost, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwaresDetails other = (SoftwaresDetails) obj;
		return Objects.equals(developedBy, other.developedBy) && Objects.equals(nameOfSoft, other.nameOfSoft)
				&& productCost == other.productCost && Objects.equals(version, other.version);
	}
	
	
}
