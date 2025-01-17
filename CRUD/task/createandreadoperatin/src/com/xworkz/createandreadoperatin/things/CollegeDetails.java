package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class CollegeDetails {
	private String collegeName;
	private String collegeId;
	private String principal;
	private String studentName;
	
	public CollegeDetails() {
		System.out.println("This is default constructor");
	}
	public CollegeDetails(String collegeName, String collegeId, String principal, String studentName) {
		super();
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.principal = principal;
		this.studentName = studentName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "CollegeDetails [collegeName=" + collegeName + ", collegeId=" + collegeId + ", principal=" + principal
				+ ", studentName=" + studentName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(collegeId, collegeName, principal, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollegeDetails other = (CollegeDetails) obj;
		return Objects.equals(collegeId, other.collegeId) && Objects.equals(collegeName, other.collegeName)
				&& Objects.equals(principal, other.principal) && Objects.equals(studentName, other.studentName);
	}
	
	
	
}
