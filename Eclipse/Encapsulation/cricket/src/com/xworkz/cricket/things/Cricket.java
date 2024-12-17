package com.xworkz.cricket.things;

public class Cricket {
		private String nameOfPlayer;
		private String nameOfTeam;
		private String coachName;
		private int order;
		private String nameincricket;
		
		public String getNameOfPlayer() {
			return nameOfPlayer;
		}
		public void setNameOfPlayer(String nameOfPlayer) {
			this.nameOfPlayer = nameOfPlayer;
		}
		public String getNameOfTeam() {
			return nameOfTeam;
		}
		public void setNameOfTeam(String nameOfTeam) {
			this.nameOfTeam = nameOfTeam;
		}
		public String getCoachName() {
			return coachName;
		}
		public void setCoachName(String coachName) {
			this.coachName = coachName;
		}
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public String getNameincricket() {
			return nameincricket;
		}
		public void setNameincricket(String nameincricket) {
			this.nameincricket = nameincricket;
		}
		@Override
		public String toString() {
			return "Cricket : nameOfPlayer=" + nameOfPlayer + ", nameOfTeam=" + nameOfTeam + ", coachName=" + coachName
					+ ", order=" + order + ", nameincricket=" + nameincricket;
		}
		
		
		
}
