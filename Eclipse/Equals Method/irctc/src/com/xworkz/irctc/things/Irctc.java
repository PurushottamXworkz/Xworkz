package com.xworkz.irctc.things;

public class Irctc {
		private String userName;
		private int loginId;
		
		public Irctc() {
			System.out.println("This is default constructor");
		}
		
		public void setUserName(String userName) {
			this.userName=userName;
		}
		public String getUserName() {
			return userName;
		}
		public void setLoginId(int loginId) {
			this.loginId=loginId;
		}
		public int getLoginId() {
			return loginId;
		}
		
		@Override
		public String toString() {
			return "User credentials[ User name :"+this.userName + ", Login ID :"+this.loginId+" ]";
		}
		@Override
		public boolean equals(Object obj) {
				if(obj==null)
					return false;
				if(obj==this)
					return true;
				if(getClass()!=this.getClass())
					return false;
				
				Irctc another=(Irctc) obj;
				if(this.getUserName()!=null)
					if(!(this.getUserName()==another.getUserName()))
						return false;
					if(!(this.getLoginId()==another.getLoginId()))
						return false;
					
					
			return true;
		}
		
		
}
