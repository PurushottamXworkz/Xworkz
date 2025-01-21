package com.xworkz.jobApplicationDetailsRunner.things;

public class JobOperations {
		JobDetails[] details=new JobDetails[5];
		int index=0;
		
		public String saveDetails(JobDetails job) {
			if(job!=null) {
				if(index < details.length) {
					details[index]=job;
					index++;
					return "Data saved successfully";
				}else {
					return "Data is not saved. Due to array is full";
				}
			}
			return "Data is not saved . It is null";
		}
		
		public void readDetails() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
		
		public void updateDetailsByJobId(JobDetails updateddetails) {
			if(updateddetails!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getJobId()==updateddetails.getJobId()) {
						details[i]=updateddetails;
						System.out.println("Data updated Successfully");
					}else {
						System.out.println("Data is not updated");
					}
				}
			}
		}
		
		public void deleteDetailsByJobId(String jobId) {
			if(jobId!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getJobId()==jobId) {
						details[i]=null;
						System.out.println("Data is Deleted Successfully");
					}else {
						System.out.println("Data is not Deleted");
					}
				}
			}
		}
		
		
		public void searchDetailsByLocation(String location) {
			if(location!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getLocation().equals(location)) {
						System.out.println(details[i]);
					}else {
						System.out.println("Data is not matched");
					}
				}
			}
		}
		
		public void searchDetailsByEmail(String email) {
			if(email!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getEmail().equals(email)) {
						System.out.println(details[i]);
					}else {
						System.out.println("Data is not matched");
					}
				}
			}
		}
		
		public void searchDetailsByLanguage(String language) {
			if(language!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getLanguage().equals(language)) {
						System.out.println(details[i]);
					}
				}
			}
		}
		
		public void searchDetailsByJobId(String jobId) {
			if(jobId!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getJobId().equals(jobId)) {
						System.out.println(details[i]);
					}
				}
			}
		}
		
		
		public void searchByLocEmailLanJob(String location,String email,String language,String jobId) {
			if(location!=null && email!=null && language!=null && jobId!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null 
							&& details[i].getLocation().equals(location)
							&& details[i].getEmail().equals(email)
							&& details[i].getLanguage().equals(language)
							&& details[i].getJobId().equals(jobId)) {
						System.out.println(details[i]);
					}
					else {
						System.out.println("The data is not present");
					}
				}
			}
		} 
		
}
