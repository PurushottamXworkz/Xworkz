package com.xworkz.organisation.things;

public class Organisation {
	private String nameOfOrganisation;
	private int employess;
	private String ceoName;
	private String headQuaters;
	private String odc;
	
	public String getNameOfOrganisation() {
		return nameOfOrganisation;
	}
	public void setNameOfOrganisation(String nameOfOrganisation) {
		this.nameOfOrganisation = nameOfOrganisation;
	}
	public int getEmployess() {
		return employess;
	}
	public void setEmployess(int employess) {
		this.employess = employess;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getHeadQuaters() {
		return headQuaters;
	}
	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	public String getOdc() {
		return odc;
	}
	public void setOdc(String odc) {
		this.odc = odc;
	}
	@Override
	public String toString() {
		return "Organisation : nameOfOrganisation=" + nameOfOrganisation + ", employess=" + employess + ", ceoName="
				+ ceoName + ", headQuaters=" + headQuaters + ", odc=" + odc;
	}
	
	
}
