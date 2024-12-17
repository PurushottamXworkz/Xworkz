package com.xworkz.actress.things;

public class Actress {
		private String nameOfActress;
		private String nameOfMovie;
		private String awardMovie;
		private String firstMovie;
		private String language;
		
		public void setnameOfActress(String nameOfActress) {
			this.nameOfActress=nameOfActress;
		}
		public String getNameOfActress(String nameOfMovie) {
			return nameOfActress;
		}
		public void setNameOfmovie(String nameOfmovie) {
			this.nameOfMovie=nameOfmovie;
		}
		public String getNameOfMovie() {
			return nameOfMovie;
		}
		public void setAwardMovie(String awardMovie) {
			this.awardMovie=awardMovie;
		}
		public String getAwardMovie() {
				return awardMovie;
		}
		
		public void setFirstMovie(String firstMovie) {
			this.firstMovie=firstMovie;
		}
		
		public String getFirstMovie() {
			return firstMovie;
		}
		
		
		public void setlanguage(String language) {
			this.language=language;
		}
		public String language() {
			return language;
		}
		
		@Override
		public String toString() {
			return "Actress : nameOfActress=" + nameOfActress + ", nameOfMovie=" + nameOfMovie + ", awardMovie="
					+ awardMovie + ", firstMovie=" + firstMovie + ", language=" + language;
		}
		
		
}
