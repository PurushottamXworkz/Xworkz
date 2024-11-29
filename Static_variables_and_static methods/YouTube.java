class YouTube{
	static String headquarters;
	static String ownby;
	static String mail;
	long netWorth;
	String contentBy;


	YouTube(){
		System.out.println("This is Default constructor");
	}

	YouTube(long netWorth){
		this.netWorth=netWorth;
		System.out.println("Networth : $"+netWorth);
	}

	YouTube(long netWorth,String contentBy){
		this(netWorth);
		this.contentBy=contentBy;
		System.out.println("Content By : "+contentBy);
	}

	static{
		headquarters="California";
		ownby="Google";
		mail="youtube@gmail.com";
	}

}