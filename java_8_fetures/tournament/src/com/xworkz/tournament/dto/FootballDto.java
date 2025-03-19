package com.xworkz.tournament.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class FootballDto {
		private String name;
		private String teamName;
		private LocalDateTime time;
		
		public FootballDto(String name, String teamName, LocalDateTime time) {
			super();
			this.name = name;
			this.teamName = teamName;
			this.time = time;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, teamName, time);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FootballDto other = (FootballDto) obj;
			return Objects.equals(name, other.name) && Objects.equals(teamName, other.teamName)
					&& Objects.equals(time, other.time);
		}

		@Override
		public String toString() {
			return "FootballDto [name=" + name + ", teamName=" + teamName + ", time=" + time + "]";
		}
				
}