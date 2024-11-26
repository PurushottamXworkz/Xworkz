class Show{
	public static void main(String args[]){
		BookMyShow bookMyShow=new BookMyShow("Devara",5,
			Location.DHARWAD,SelectScreen.SCREEN_TWO,Shows.MATNIEE);

		System.out.println(bookMyShow.movieName);
		System.out.println(bookMyShow.noOfTickets);
		System.out.println(bookMyShow.location);
		System.out.println(bookMyShow.selectScreen);
		System.out.println(bookMyShow.shows);

	}
}