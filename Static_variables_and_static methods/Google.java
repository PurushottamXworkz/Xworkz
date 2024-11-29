class Google{
	static String nameOfOrganization;
	static String browserName;

	public static void services(){
	System.out.println("This is Service method");
	}

	public static void products(){
		System.out.println("This is product method");
	}

	public void hrDept(){
		System.out.println("This is HR Department");
	}

	public void talentAqusition(){
		System.out.println("This is talent Aquisition");
	}

	static{
		nameOfOrganization="Google";
		browserName="Gemini";
	}
}