package com.xworkz.jobApplicationDetailsRunner;

import com.xworkz.jobApplicationDetailsRunner.things.JobDetails;
import com.xworkz.jobApplicationDetailsRunner.things.JobOperations;

public class JobRunner {
	public static void main(String[] args) {
		JobDetails details=new JobDetails();
		details.setOrganizationName("Google");
		details.setJobId("SDE-1234");
		details.setJobRole("Software developer");
		details.setLanguage("English,Hindi,Kannada");
		details.setLocation("Los Angel");
		details.setNameOfHR("RadhaKrishna");
		details.setEmail("radhakrishnaHR@google.com");
		
		
		JobDetails details2=new JobDetails();
		details2.setOrganizationName("Amazon");
		details2.setJobId("SDE-4567");
		details2.setJobRole("Software developer");
		details2.setLanguage("English,Hindi,Kannada");
		details2.setLocation("Bangalore");
		details2.setNameOfHR("Radha");
		details2.setEmail("radhaHR@amazon.com");
		
		
		JobDetails details3=new JobDetails();
		details3.setOrganizationName("Meta");
		details3.setJobId("SDE-8745");
		details3.setJobRole("Software developer");
		details3.setLanguage("English,Hindi,Kannada");
		details3.setLocation("Berlin");
		details3.setNameOfHR("Hally");
		details3.setEmail("hallyHR@meta.com");
		
		
		JobDetails details4=new JobDetails();
		details4.setOrganizationName("Acer");
		details4.setJobId("SDE12341");
		details4.setJobRole("Software developer");
		details4.setLanguage("English,Hindi,Kannada");
		details4.setLocation("North Holland");
		details4.setNameOfHR("Jenny");
		details4.setEmail("jennyHR@meta.com");
		
		
		
		JobDetails details5=new JobDetails();
		details4.setOrganizationName("Dell");
		details4.setJobId("EMB 123");
		details4.setJobRole("Embedded Engineer");
		details4.setLanguage("English,Hindi,Kannada");
		details4.setLocation("Japan");
		details4.setNameOfHR("Julie");
		details4.setEmail("julieHR@dell.com");
		
		
		JobOperations jobOperations=new JobOperations();
		jobOperations.saveDetails(details);
		jobOperations.saveDetails(details2);
		jobOperations.saveDetails(details3);
		jobOperations.saveDetails(details4);
		
		System.out.println("==========================READING DATA==============================");
		jobOperations.readDetails();   
		System.out.println("====================================================================");
		
		JobDetails updateDetails=new JobDetails();
		updateDetails.setJobId("SDE-8745");
		updateDetails.setEmail("praveenHR@meta.com");
		updateDetails.setJobRole("Software engineer II");
		updateDetails.setLanguage("English,French,German");
		updateDetails.setLocation("Munich");
		updateDetails.setNameOfHR("Praveen");
		updateDetails.setOrganizationName("Meta 2.O");
		
		System.out.println("===================================================================");
		jobOperations.updateDetailsByJobId(updateDetails);
		jobOperations.readDetails();
		
		System.out.println("===================================================================");
		jobOperations.saveDetails(details5);
		jobOperations.readDetails();
		System.out.println("=========================DELETE And SEARCH==========================================");
		
		jobOperations.deleteDetailsByJobId("SDE-1234");
		System.out.println("===================================================================");
		jobOperations.searchDetailsByLocation("Japan");
		jobOperations.searchDetailsByLanguage("English");
		System.out.println("===================================================================");
		
		jobOperations.readDetails();
		System.out.println("=========================Search By Location Email Language Job ID==========================================");
		
		jobOperations.searchByLocEmailLanJob("Japan", "julieHR@dell.com", "English,Hindi,Kannada", "EMB 123");
		
		System.out.println("====================================================================");
		
	}
}
