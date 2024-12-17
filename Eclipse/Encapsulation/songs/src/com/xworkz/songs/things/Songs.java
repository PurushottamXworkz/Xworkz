package com.xworkz.songs.things;

public class Songs {
		private String singer;
		private String songType;
		private String composedBy;
		private String corus;
		private int budget;
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public String getSongType() {
			return songType;
		}
		public void setSongType(String songType) {
			this.songType = songType;
		}
		public String getComposedBy() {
			return composedBy;
		}
		public void setComposedBy(String composedBy) {
			this.composedBy = composedBy;
		}
		public String getCorus() {
			return corus;
		}
		public void setCorus(String corus) {
			this.corus = corus;
		}
		public int getBudget() {
			return budget;
		}
		public void setBudget(int budget) {
			this.budget = budget;
		}
		@Override
		public String toString() {
			return "Songs : singer=" + singer + ", songType=" + songType + ", composedBy=" + composedBy + ", corus="
					+ corus + ", budget=" + budget ;
		}
		
}
