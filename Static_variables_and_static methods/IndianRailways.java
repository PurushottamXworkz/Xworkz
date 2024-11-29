class IndianRailways{
	static String transportBy;
	static String establishedIn;
	static String controlledBy;
	String railwayMinister;
	long income;


	IndianRailways(){
		System.out.println("This is Default constructor");
	}

	IndianRailways(String railwayMinister){
		this();
		this.railwayMinister=railwayMinister;
		System.out.println("Railway Minister : "+railwayMinister);
	}

		IndianRailways(String railwayMinister,long income){
			this(railwayMinister);
			this.income=income;
		System.out.println("Income :"+income);
	}


	



	static{
	  transportBy="Indian Railways";
	  establishedIn="1853";
	  controlledBy="Government of India";
	}
}