class OnlineRegistration{
	public static void main(String args[]){
	Registration reg=new Registration("Dharani","Soorya",Gender.MALE,
		City.MUMBAI,Country.INDIA);

	System.out.println(reg.firstName);
	System.out.println(reg.lastName);
	System.out.println(reg.gender);
	System.out.println(reg.city);
	System.out.println(reg.country);


	}
}