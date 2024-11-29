class BookTicket{
	String passangerName;
	Gender gender;
	PreferenceCoach preferenceCoach;
	ReservationQuota reservationQuota;
	MealsOnTravel mealsOnTravel;
	PassengerId passengerId;



	BookTicket(String passangerName,
	Gender gender,
	PreferenceCoach preferenceCoach,
	ReservationQuota reservationQuota,
	MealsOnTravel mealsOnTravel,
	PassengerId passengerId)
	{
		this.passangerName=passangerName;
		this.gender=gender;
		this.preferenceCoach=preferenceCoach;
		this.reservationQuota=reservationQuota;
		this.mealsOnTravel=mealsOnTravel;
		this.passengerId=passengerId;
	}
}