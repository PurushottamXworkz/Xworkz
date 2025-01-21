package com.xworkz.jobApplicationDetailsRunner.things;

import java.util.Objects;

public class JobDetails {
		private String jobId;
		private String jobRole;
		private String location;
		private String email;
		private String language;
		private String organizationName;
		private String nameOfHR;
		
		public JobDetails() {
			System.out.println("This is default constructor");
		}

		public JobDetails(String jobId, String jobRole, String location, String email, String language,
				String organizationName, String nameOfHR) {
			super();
			this.jobId = jobId;
			this.jobRole = jobRole;
			this.location = location;
			this.email = email;
			this.language = language;
			this.organizationName = organizationName;
			this.nameOfHR = nameOfHR;
		}

		public String getJobId() {
			return jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getJobRole() {
			return jobRole;
		}

		public void setJobRole(String jobRole) {
			this.jobRole = jobRole;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getOrganizationName() {
			return organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getNameOfHR() {
			return nameOfHR;
		}

		public void setNameOfHR(String nameOfHR) {
			this.nameOfHR = nameOfHR;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, jobId, jobRole, language, location, nameOfHR, organizationName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			JobDetails other = (JobDetails) obj;
			return Objects.equals(email, other.email) && Objects.equals(jobId, other.jobId)
					&& Objects.equals(jobRole, other.jobRole) && Objects.equals(language, other.language)
					&& Objects.equals(location, other.location) && Objects.equals(nameOfHR, other.nameOfHR)
					&& Objects.equals(organizationName, other.organizationName);
		}

		@Override
		public String toString() {
			return "JobDetails [jobId=" + jobId + ", jobRole=" + jobRole + ", location=" + location + ", email=" + email
					+ ", language=" + language + ", organizationName=" + organizationName + ", nameOfHR=" + nameOfHR
					+ "]";
		}
				
}
