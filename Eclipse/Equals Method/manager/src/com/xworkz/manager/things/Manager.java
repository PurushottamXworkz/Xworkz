package com.xworkz.manager.things;

public class Manager {
			public int uniqueNumber=7;
			private int managerId;
			private String fName;
			private String lName;
			private long contact;
			private String state;
			private String district;
			private String country;
			private int salary;
			
			
			public int getManagerId() {
				return managerId;
			}
			public void setManagerId(int managerId) {
				this.managerId = managerId;
			}
			public String getfName() {
				return fName;
			}
			public void setfName(String fName) {
				this.fName = fName;
			}
			public String getlName() {
				return lName;
			}
			public void setlName(String lName) {
				this.lName = lName;
			}
			public long getContact() {
				return contact;
			}
			public void setContact(long contact) {
				this.contact = contact;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getDistrict() {
				return district;
			}
			public void setDistrict(String district) {
				this.district = district;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			
			@Override
			public String toString() {
				return "Manager Details \n["
						+ "managerId :"+managerId + ", fName : "+fName+ ", lName :"+lName+ ", contact :"+contact
						+ ", state :"+state+ ", district :"+district+ ", country :"+country+ ", salary :"+salary+ "]";
			}
			@Override
			public boolean equals(Object obj) {
				if(obj==null)
					return false;
				if(this==obj)
					return true;
				if(getClass()!=this.getClass())
					return false;
				
				
				Manager manager=(Manager) obj;
				
				if(manager.fName!=null)
					if(!(this.getfName()==manager.getfName()))
						return false;
				
				if(manager.lName!=null)
					if(!(this.getlName()==manager.getlName()))
						return false;
				
				if(manager.district!=null)
					if(!(this.getDistrict()==manager.getDistrict()))
						return false;
				
				if(manager.country!=null)
					if(!(this.getCountry()==manager.getCountry()))
						return false;
				
				if(manager.state!=null)
					if(!(this.getState()==manager.getState()))
						return false;
				
				if(!(this.getContact()==manager.getContact()))
					return false;
				
				if(!(this.getManagerId()==manager.getManagerId()))
					return false;
				
				if(!(this.getSalary()==manager.getSalary()))
					return false;
				
				
				return true;
			}
			@Override
			public int hashCode() {
				int code=3;
				int hashResult=1;
				hashResult=code*hashResult+((this.country==null)? 0 : country.hashCode());
				hashResult=code*hashResult+((this.district==null) ? 0 : district.hashCode());
				hashResult=code*hashResult+((this.fName==null) ? 0 : fName.hashCode());
				hashResult=code*hashResult+((this.lName==null) ? 0: lName.hashCode());
				hashResult=code*hashResult+((this.state==null) ? 0 :state.hashCode());			
				return hashResult;
			}
			
}
