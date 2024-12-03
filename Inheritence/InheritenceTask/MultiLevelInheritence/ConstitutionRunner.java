class ConstitutionRunner{
	public static void main(String[] args) {

			HighCourts high= new HighCourts();

			System.out.println("Funtion of High Courts : "+high.legalGuidance());
			System.out.println("Funtion of High Courts : "+high.courtOfRecord());
			System.out.println("Name of High Courts: "+high.nameOfCourt);
			System.out.println("Number of High Court justices: "+high.noOfJustice);
			System.out.println("-------------------------------------------------");
			System.out.println("Court Name : "+high.courtName);
			System.out.println("Name of Justice : "+high.nameOfJustice);
			System.out.println("Funtion of Supreme Courts : "+high.judicialReview());
			System.out.println("Funtion of Supreme Courts : "+high.hearingAppleals());
			System.out.println("-------------------------------------------------");
			System.out.println("Name of Constitution : "+high.nameOfConstitution);
			System.out.println("Name of country : "+high.country);
			System.out.println("Name of President : "+high.nameOfPresident);
			System.out.println("-------------------------------------------------");


	}
}