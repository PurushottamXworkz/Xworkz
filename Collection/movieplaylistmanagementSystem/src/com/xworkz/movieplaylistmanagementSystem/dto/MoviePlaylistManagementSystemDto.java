package com.xworkz.movieplaylistmanagementSystem.dto;

import java.util.Objects;

public class MoviePlaylistManagementSystemDto {
		 private String tiltle;
		 private String genre;
		 private String director;
		 private String movie;
		 
		public MoviePlaylistManagementSystemDto(String tiltle, String genre, String director, String movie) {
			super();
			this.tiltle = tiltle;
			this.genre = genre;
			this.director = director;
			this.movie = movie;
		}

		public String getTiltle() {
			return tiltle;
		}

		public void setTiltle(String tiltle) {
			this.tiltle = tiltle;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getMovie() {
			return movie;
		}

		public void setMovie(String movie) {
			this.movie = movie;
		}

		@Override
		public int hashCode() {
			return Objects.hash(director, genre, movie, tiltle);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MoviePlaylistManagementSystemDto other = (MoviePlaylistManagementSystemDto) obj;
			return Objects.equals(director, other.director) && Objects.equals(genre, other.genre)
					&& Objects.equals(movie, other.movie) && Objects.equals(tiltle, other.tiltle);
		}

		@Override
		public String toString() {
			return "MoviePlaylistManagementSystem [tiltle=" + tiltle + ", genre=" + genre + ", director=" + director
					+ ", movie=" + movie + "]";
		}
		
		
		 
}
