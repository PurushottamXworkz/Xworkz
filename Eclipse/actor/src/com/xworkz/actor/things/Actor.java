package com.xworkz.actor.things;

public class Actor {
		private String nameOfActor;
		private int numOfMovies;
		private String language;
		
		public void setNameOfActor(String nameOfActor) {
			this.nameOfActor=nameOfActor;
		}
		
		public void setNumOfMovies(int numOfMovies) {
			this.numOfMovies=numOfMovies;
		}
		
		public void setLanguage(String language) {
			this.language=language;
		}
		
		public String getNameOfActor() {
			return "Name : "+nameOfActor;
		}
		
		public int getNumOfMovies() {
			return +numOfMovies;
		}
		@Override
		public String toString() {
			return "Num of movies :" +getNumOfMovies() ;
		}
		
		public String getLanguage() {
			return "Language :"+language;
		}
}
