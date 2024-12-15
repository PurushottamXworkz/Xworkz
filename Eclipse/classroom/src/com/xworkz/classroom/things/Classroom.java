package com.xworkz.classroom.things;

public class Classroom {
		private int noOfClassrooms;
		private String subject;
		private String trainer;
		private String onlinePlatform;
		private int weekOffs;
		
		public Classroom(int noOfClassrooms, String subject, String trainer, String onlinePlatform, int weekOffs) {
			this.noOfClassrooms = noOfClassrooms;
			this.subject = subject;
			this.trainer = trainer;
			this.onlinePlatform = onlinePlatform;
			this.weekOffs = weekOffs;
		}

		public String toString() {
			return "Classroom [noOfClassrooms=" + noOfClassrooms + ", subject=" + subject + ", trainer=" + trainer
					+ ", onlinePlatform=" + onlinePlatform + ", weekOffs=" + weekOffs + "]";
		}
		
		
		
}
