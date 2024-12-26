package com.xworkz.instituteregistration.things;

public class Registartion {
		private String firstName;
		private String lastName;
		private String category;
		private String country;
		private String state;
		private String district;
		private String street;
		private String guardian;
		
		private String placeOfBirth;
		private String password;
		private String transactionID;
		private String quota;
		
		private boolean payment;
		
		private float scoreInSSLC;
		private float scoreInPUC;
		private float ScoreInBachelors;
		
		private int totalFees;
		private int regNumber;
		private long contact;
		private long guardianContact;
		
		
		public Registartion() {
			System.out.println("This is Default constructor");
		}
		
		
		
		
		public Registartion(String firstName, String lastName, String category, String country, String state,
				String district, String street, String guardian, String placeOfBirth, String password,
				String transactionID, String quota, boolean payment, float scoreInSSLC, float scoreInPUC,
				float scoreInBachelors, int totalFees, int regNumber, long contact, long guardianContact) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.category = category;
			this.country = country;
			this.state = state;
			this.district = district;
			this.street = street;
			this.guardian = guardian;
			this.placeOfBirth = placeOfBirth;
			this.password = password;
			this.transactionID = transactionID;
			this.quota = quota;
			this.payment = payment;
			this.scoreInSSLC = scoreInSSLC;
			this.scoreInPUC = scoreInPUC;
			ScoreInBachelors = scoreInBachelors;
			this.totalFees = totalFees;
			this.regNumber = regNumber;
			this.contact = contact;
			this.guardianContact = guardianContact;
		}




		public void setFirstName(String firstName) {
			this.firstName=firstName;
		}
		public String getFirstName() {
			return firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName=lastName;
		}
		public String getLastName() {
			return lastName;
		}
		
		public void setCategory(String category) {
			this.category=category;
		}
		public String getCategory() {
			return category;
		}
		public void setCountry(String country) {
			this.country=country;
		}
		public String getCountry() {
			return country;
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return state;			
		}
		public void setDistrict(String district) {
			this.district=district;
		}
		public String getDistrict() {
			return district;
		}
		public void setStreet(String street) {
			this.street=street;
		}
		public String getStreet() {
			return street;
		}
		public String getGuardian() {
			return guardian;
		}
		public void setGuardian(String guardian) {
			this.guardian = guardian;
		}
		public long getGuardianContact() {
			return guardianContact;
		}
		public void setGuardianContact(long guardianContact) {
			this.guardianContact = guardianContact;
		}
		public String getPlaceOfBirth() {
			return placeOfBirth;
		}
		public void setPlaceOfBirth(String placeOfBirth) {
			this.placeOfBirth = placeOfBirth;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTransactionID() {
			return transactionID;
		}
		public void setTransactionID(String transactionID) {
			this.transactionID = transactionID;
		}
		public String getQuota() {
			return quota;
		}
		public void setQuota(String quota) {
			this.quota = quota;
		}
		public boolean isPayment() {
			return payment;
		}
		public void setPayment(boolean payment) {
			this.payment = payment;
		}
		public float getScoreInSSLC() {
			return scoreInSSLC;
		}
		public void setScoreInSSLC(float scoreInSSLC) {
			this.scoreInSSLC = scoreInSSLC;
		}
		public float getScoreInPUC() {
			return scoreInPUC;
		}
		public void setScoreInPUC(float scoreInPUC) {
			this.scoreInPUC = scoreInPUC;
		}
		public float getScoreInBachelors() {
			return ScoreInBachelors;
		}
		public void setScoreInBachelors(float scoreInBachelors) {
			ScoreInBachelors = scoreInBachelors;
		}
		public int getTotalFees() {
			return totalFees;
		}
		public void setTotalFees(int totalFees) {
			this.totalFees = totalFees;
		}
		public int getRegNumber() {
			return regNumber;
		}
		public void setRegNumber(int regNumber) {
			this.regNumber = regNumber;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Details of Registration \n" + " [\n firstName=" + firstName 
					+ "\n lastName=" + lastName  
					+ "\n category=" + category 
					+ "\n country=" + country 
					+ "\n state=" + state 
					+"\n district=" + district
					+ "\n street=" + street 
					+ "\n guardian=" + guardian 
					+ "\n placeOfBirth=" + placeOfBirth 
					+ "\n password=" + password
					+ "\n transactionID=" + transactionID 
					+ "\n quota=" + quota 
					+ "\n payment=" + payment
					+ "\n scoreInSSLC=" + scoreInSSLC
					+ "\n scoreInPUC=" + scoreInPUC 
					+ "\n ScoreInBachelors="+ ScoreInBachelors 
					+ "\n totalFees=" + totalFees 
					+ "\n regNumber=" + regNumber 
					+ "\n contact="	+ contact
					+ "\n guardianContact=" + guardianContact + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj==null)
				return false;
			if(obj==this)
				return true;
			if(getClass()!=this.getClass())
				return false;
			
			Registartion reg=(Registartion) obj;
			if(reg.getFirstName()!=null)
				if(!(this.getFirstName()==reg.getFirstName()))
					return false;
			if(reg.getLastName()!=null)
				if(!(this.getLastName()==reg.getLastName()))
					return false;
			if(reg.getCategory()!=null)
				if(!(this.getCategory()==reg.getCategory()))
					return false;
			if(reg.getCountry()!=null)
				if(!(this.getCountry()==reg.getCountry()))
					return false;
			if(reg.getState()!=null)
				if(!(this.getState()==reg.getState()))
					return false;
			if(reg.getDistrict()!=null)
				if(!(this.getDistrict()==reg.getDistrict()))
					return false;
			if(reg.getStreet()!=null)
				if(!(this.getStreet()==reg.getStreet()))
					return false;
			if(reg.getGuardian()!=null)
				if(!(this.getGuardian()==reg.getGuardian()))
					return false;
			if(reg.getPlaceOfBirth()!=null)
				if(!(this.getPlaceOfBirth()==reg.getPlaceOfBirth()))
					return false;
			if(reg.getPassword()!=null)
				if(!(this.getPassword()==reg.getPassword()))
					return false;
			if(reg.getTransactionID()!=null)
				 if(!(this.getTransactionID()==reg.getTransactionID()))
					 return false;
			if(reg.getQuota()!=null)
				if(!(this.getQuota()==reg.getQuota()))
					return false;
			if(!(this.isPayment()==reg.isPayment()))
					return false;
			if(!(this.getScoreInSSLC()==reg.getScoreInSSLC()))
				return false;
			if(!(this.getScoreInPUC()==reg.getScoreInPUC()))
				return false;
			if(!(this.getScoreInBachelors()==reg.getScoreInBachelors()))
				return false;
			if(!(this.getTotalFees()==reg.getTotalFees()))
				return false;
			if(!(this.getRegNumber()==reg.getRegNumber()))
				return false;
			if(!(this.getContact()==reg.getContact()))
				return false;
			if(!(this.getGuardianContact()==reg.getGuardianContact()))
				return false;		
			return true;
			
		}
		
}
