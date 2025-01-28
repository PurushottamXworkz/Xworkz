package com.xworkz.movie.dto;

import java.util.Objects;

public class MovieDto {
		private String nameOfMovie;
		private String producedBy;
		private String leadCast;
		private String musicBy;
		private String thetreName;
		
		public MovieDto() {
			System.out.println("-----------------------Constructor--------------------");
		}

		public MovieDto(String nameOfMovie, String producedBy, String leadCast, String musicBy, String thetreName) {
			super();
			this.nameOfMovie = nameOfMovie;
			this.producedBy = producedBy;
			this.leadCast = leadCast;
			this.musicBy = musicBy;
			this.thetreName = thetreName;
		}

		public String getNameOfMovie() {
			return nameOfMovie;
		}

		public void setNameOfMovie(String nameOfMovie) {
			this.nameOfMovie = nameOfMovie;
		}

		public String getProducedBy() {
			return producedBy;
		}

		public void setProducedBy(String producedBy) {
			this.producedBy = producedBy;
		}

		public String getLeadCast() {
			return leadCast;
		}

		public void setLeadCast(String leadCast) {
			this.leadCast = leadCast;
		}

		public String getMusicBy() {
			return musicBy;
		}

		public void setMusicBy(String musicBy) {
			this.musicBy = musicBy;
		}

		public String getThetreName() {
			return thetreName;
		}

		public void setThetreName(String thetreName) {
			this.thetreName = thetreName;
		}

		@Override
		public int hashCode() {
			return Objects.hash(leadCast, musicBy, nameOfMovie, producedBy, thetreName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MovieDto other = (MovieDto) obj;
			return Objects.equals(leadCast, other.leadCast) && Objects.equals(musicBy, other.musicBy)
					&& Objects.equals(nameOfMovie, other.nameOfMovie) && Objects.equals(producedBy, other.producedBy)
					&& Objects.equals(thetreName, other.thetreName);
		}

		@Override
		public String toString() {
			return "MovieDto [nameOfMovie=" + nameOfMovie + ", producedBy=" + producedBy + ", leadCast=" + leadCast
					+ ", musicBy=" + musicBy + ", thetreName=" + thetreName + "]";
		}
		
		
		
}
