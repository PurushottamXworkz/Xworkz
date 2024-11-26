class BookMyShow{
	String movieName;
	int noOfTickets;
	Location location;
	SelectScreen selectScreen;
	Shows shows;

	BookMyShow(String movieName,int noOfTickets,Location location,SelectScreen selectScreen,Shows shows)
	{
		this.movieName=movieName;
		this.noOfTickets=noOfTickets;
		this.location=location;
		this.selectScreen=selectScreen;
		this.shows=shows;
	}
}