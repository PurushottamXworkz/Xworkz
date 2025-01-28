package com.workz.t20.dto;

public class T20Dto {
	private String teamName;
	private String boardName;
	private String captainName;
	private String country;
	private String placeOfMatch;
	
	
	public T20Dto() {
		System.out.println("--------------------Constructor-----------------------------");
	}
	
	public T20Dto(String teamName, String boardName, String captainName, String country, String placeOfMatch) {
		super();
		this.teamName = teamName;
		this.boardName = boardName;
		this.captainName = captainName;
		this.country = country;
		this.placeOfMatch = placeOfMatch;
	}

	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlaceOfMatch() {
		return placeOfMatch;
	}
	public void setPlaceOfMatch(String placeOfMatch) {
		this.placeOfMatch = placeOfMatch;
	}
	
	
}
