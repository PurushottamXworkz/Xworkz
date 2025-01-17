package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.CollegeDetails;
import com.xworkz.createandreadoperatin.things.OperationsCollege;

public class CollegeRunner {
	public static void main(String[] args) {
		CollegeDetails collegeDetails = new CollegeDetails();
		collegeDetails.setCollegeId("C01234");
		collegeDetails.setCollegeName("Karnataka Science College Dharwad");
		collegeDetails.setPrincipal("C.F.Mulimani");
		collegeDetails.setStudentName("Jaytheertha");
		
		CollegeDetails collegeDetails2=new CollegeDetails();
		collegeDetails2.setCollegeId("C01234");
		collegeDetails2.setCollegeName("Karnataka Science College Dharwad");
		collegeDetails2.setPrincipal("C.F.Mulimani");
		collegeDetails2.setStudentName("Purushottam");
		
		OperationsCollege college=new OperationsCollege();
		college.saveDetails(collegeDetails);
		college.saveDetails(collegeDetails2);
		college.saveDetails(collegeDetails);
		college.saveDetails(collegeDetails2);
		college.saveDetails(collegeDetails);
		college.saveDetails(collegeDetails2);
		
		college.readDetails();
	}
}
