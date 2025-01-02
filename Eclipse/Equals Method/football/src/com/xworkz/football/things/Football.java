package com.xworkz.football.things;

public class Football {
		public int uniqueNumber=147;
		private String playerName;
		private int jerseyNumber;
		private String country;
		private String clubName;
		private int noOfCupsWon;
		private long contact;
		private String address;
		private String namedAs;
		
		
		public void setPlayerName(String playerName) {
			this.playerName=playerName;
		}
		public String getPlayerName() {
			return playerName;
		}
		
		public void setJerseyNumber(int jerseyNumber) {
			this.jerseyNumber=jerseyNumber;
		}
		public int getJerseyNumber() {
			return jerseyNumber;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country=country;
		}
		
		public String getClubName() {
			return clubName;
		}
		public void setClubName(String clubName) {
			this.clubName=clubName;
		}
		public int getNoOfCupsWon() {
			return noOfCupsWon;
		}
		public void setNoOfCupsWon(int noOfCupsWon) {
			this.noOfCupsWon=noOfCupsWon;
		}
		
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact=contact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address=address;
		}
		public String getNamedAs() {
			return namedAs;
		}
		public void setNamedAs(String nameAs) {
			this.namedAs=nameAs;
		}
		@Override
		public String toString() {
			return "Football [playerName=" + playerName + ","
					+ " jerseyNumber=" + jerseyNumber + ", country=" + country
					+ ", clubName=" + clubName 
					+ ", noOfCupsWon=" + noOfCupsWon + 
					", contact=" + contact + ", address="+ address + 
					", namedAs=" + namedAs + "]";
		}
		@Override
		public boolean equals(Object obj) {
			if(obj==null)
				return false;
			if(this==obj)
				return true;
			if(getClass()!=this.getClass())
				return false;
			
			Football football=(Football)obj;
			if(football.address!=null)
				if(!(this.getAddress()==football.getAddress()))
					return false;
			
			if(football.clubName!=null)
				if(!(this.getClubName()==football.getClubName()))
					return false;
			
			if(!(this.getContact()==football.getContact()))
				return false;
			
			if(football.country!=null)
				if(!(this.getCountry()==football.getCountry()))
					return false;
			
			if(!(football.getJerseyNumber()==this.getJerseyNumber()))
				return false;
			
			if(football.namedAs!=null)
				if(!(this.getNamedAs()==football.getNamedAs()))
					return false;
			
			if(!(football.getNoOfCupsWon()==football.getNoOfCupsWon()))
				return false;
			
			if(football.playerName!=null)
				if(!(football.getPlayerName()==this.getPlayerName()))
					return false;
			
			return true;	
				
		}
		
		@Override
		public int hashCode() {
			int code=17;
			int hashResult=1;
			hashResult=code+uniqueNumber;
			hashResult=code*hashResult+((this.address==null) ? 0 :(address.hashCode()));
			hashResult=code*hashResult+((this.clubName==null) ? 0 :(clubName.hashCode()));
			hashResult=code*hashResult+((this.country==null) ? 0: (country.hashCode()));
			hashResult=code*hashResult+((this.namedAs==null) ? 0 :(namedAs.hashCode()));
			hashResult=code*hashResult+((this.playerName==null) ? 0 : (playerName.hashCode()));
			return hashResult;
			
		}
		
		
}
