package com.xworkz.teacher.things;

public class Teacher {
		private String nameOfTeacher;
		private String subject;
		private int noOfStudents;
		private int rating;
		private int salary;
		
		public void setNameOfTeacher(String nameOfTeacher) {
			this.nameOfTeacher=nameOfTeacher;
		}
		
		public String getNameOfTeacher() {
			return nameOfTeacher;
		}
		
		public void setSubject(String subject) {
			this.subject=subject;
		}
		
		public String getSubject() {
			return subject;
		}
		
		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents=noOfStudents;
		}
		public int getNoOfStudents() {
			return noOfStudents;
		}
		
		
		public void setRating(int rating) {
			this.rating=rating;
		}
		
		public int getRating() {
			return rating;
		}
		
		 
		public void setSalary(int salary) {
			this.salary=salary;
		}
		
		public int getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Teacher [nameOfTeacher=" + nameOfTeacher + ", subject=" + subject + ", noOfStudents=" + noOfStudents
					+ ", rating=" + rating + ", salary=" + salary + "]";
		}
		
}

