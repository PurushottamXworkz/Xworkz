package com.xworkz.tournament.dto;

import java.util.Objects;

public class CricketDto implements Comparable<CricketDto>{
	private int scores;
	private String name;
	
	public CricketDto(int scores, String name) {
		super();
		this.scores = scores;
		this.name = name;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, scores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CricketDto other = (CricketDto) obj;
		return Objects.equals(name, other.name) && scores == other.scores;
	}

	@Override
	public String toString() {
		return "CricketDto [scores=" + scores + ", name=" + name + "]";
	}
	

	@Override
	public int compareTo(CricketDto o) {
		// TODO Auto-generated method stub
		if(this.getScores()<o.getScores()) {
			return 1;
		}else if(this.getScores()>o.getScores()) {
			return -1;
		}
		return 0;
	}
}
