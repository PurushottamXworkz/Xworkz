class Google{
	static String nameOfOrganization;
	static String browserName;

	String ceo;
	long income;

	Google(){
		System.out.println("default constructor");
	}
	Google(String ceo){
		this();
		System.out.println("Name Of CEO : "+ceo);
	}
	Google(String ceo,long income){
		this(ceo);
		this.income=income;
		System.out.println("This is income : "+income);
	}

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