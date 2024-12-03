class InfosysRunner{
	public static void main(String[] args) {
		HackWithInfy hack=new HackWithInfy();
		System.out.println("-----------------------------------------");
		System.out.println("HackWithInfy type of Service : "+hack.typeOfService);
		System.out.println("HackWithInfy Organisation : "+hack.nameOfOrganisation);
		System.out.println("HackWithInfy Founder of Organisation : "+hack.nameOfFounder);
		System.out.println("HackWithInfy services : "+hack.services());
		System.out.println("HackWithInfy Maintainance : "+hack.maintainace());

		System.out.println("-----------------------------------------");
		InfosysSpringBoard infy=new InfosysSpringBoard();
		System.out.println("Type of service : "+infy.typeOfService); 
		System.out.println("Author : "+infy.author); 
		System.out.println("Instructors : "+infy.Instructors()); 
		System.out.println("Sponsership : "+infy.sponsership()); 
		System.out.println("-----------------------------------------");
	}
}