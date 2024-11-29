class OnlineTicketBooking{
	public static void main(String args[]){
		BookTicket bookTicket=new BookTicket("Abhijit",
			Gender.MALE,
			PreferenceCoach.UPPER,
			ReservationQuota.GENERAL,
			MealsOnTravel.REQUIRED,
			PassengerId.VOTER);

		System.out.println(bookTicket.passangerName);
		System.out.println(bookTicket.gender);
		System.out.println(bookTicket.preferenceCoach);
		System.out.println(bookTicket.reservationQuota);
		System.out.println(bookTicket.mealsOnTravel);
		System.out.println(bookTicket.passengerId);
	}
}