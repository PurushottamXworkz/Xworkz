package com.xworkz.cricket.things;

public class Cricket {
	public int uniqueNumber=17;
	private int jerseyNumber;
	private String orderPlaying;
	private String nameOfPlayer;
	private String teamName;
	private String nameOfCountry;
	private String callBy;
	private String stateFrom;
	private String nameOfBoard;
	
	public void setJerseyNumber(int jerseyNumber){
		this.jerseyNumber=jerseyNumber;
	}
	
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	
	public void setOderPlaying(String orderPlaying) {
		this.orderPlaying=orderPlaying;
	}
	public String getOderPlaying() {
		return orderPlaying;
	}
	
	public void setNameOfPlayer(String nameOfPlayer) {
		this.nameOfPlayer=nameOfPlayer;
	}
	public String getNameOfPlayer() {
		return nameOfPlayer;
	}
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry=nameOfCountry;
	}
	public String getNameOfCountry() {
		return nameOfCountry;
	}
	public void setCallBy(String callBy) {
		this.callBy=callBy;
	}
	public String getCallBy() {
		return callBy;
	}
	public void setStateFrom(String stateFrom) {
		this.stateFrom=stateFrom;
	}
	public String getStateFrom() {
		return stateFrom;
	}
	public void setNameOfBoard(String nameOfBoard) {
		this.nameOfBoard=nameOfBoard;
	}
	public String getNameOfBoard() {
		return nameOfBoard;
	}
	
	@Override
	public String toString() {
		return "Cricket Player Info ["
				+ "jerseyNumber: "+jerseyNumber
				+ ",orderPlaying: "+orderPlaying
				+",nameOfPlayer: "+nameOfPlayer
				+",teamName: "+teamName
				+",nameOfCountry: "+nameOfCountry
				+",callBy: "+callBy
				+",stateFrom: "+stateFrom
				+",nameOfBoard: "+nameOfBoard
				+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(getClass()!=this.getClass())
			return false;
		
		Cricket cricket=(Cricket)obj;
		if(!(this.getJerseyNumber()!=cricket.getJerseyNumber()))
			return false;
		
		if(cricket.orderPlaying!=null)
			if(!(this.getOderPlaying()!=cricket.getOderPlaying()))
				return false;
		
		if(cricket.getNameOfPlayer()!=null)
			if(!(this.getNameOfPlayer()!=cricket.getNameOfPlayer()))
				return false;
		
		if(cricket.getTeamName()!=null)
			if(!(this.getTeamName()!=cricket.getTeamName()))
				return false;
		
		if(cricket.getNameOfCountry()!=null)
			if(!(this.getNameOfCountry()!=cricket.getNameOfCountry()))
				return false;
			
		if(cricket.getCallBy()!=null)
			if(!(this.getCallBy()!=cricket.getCallBy()))
				return false;
		
		if(cricket.getStateFrom()!=null)
			if(!(this.getStateFrom()!=cricket.getStateFrom()))
				return false;
		
		if(cricket.getNameOfBoard()!=null)
			if(!(this.getNameOfBoard()!=cricket.getNameOfBoard()))
				return false;
		
		return true;
	}
	@Override
	public int hashCode() {
		int code=3;
		int hashResult=1;
		hashResult=code+uniqueNumber;
		hashResult=code*hashResult+((this.getOderPlaying()==null)? 0: (orderPlaying.hashCode()));
		hashResult=code*hashResult+((this.getNameOfPlayer()==null)? 0 : (orderPlaying.hashCode()));
		hashResult=code*hashResult+((this.getTeamName()==null)? 0: (teamName.hashCode()));
		hashResult=code*hashResult+((this.getNameOfCountry()==null) ? 0 :(nameOfCountry.hashCode()));
		hashResult=code*hashResult+((this.getCallBy()==null) ? 0: (callBy.hashCode()));
		hashResult=code*hashResult+((this.getStateFrom()==null)? 0 :(stateFrom.hashCode()));
		hashResult=code*hashResult+((this.getNameOfBoard()==null)? 0 : (nameOfBoard.hashCode()));
		return hashResult;
	}
}
