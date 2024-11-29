class ForestsInIndia{
	static String nameOfForest;
	static int noOfRivers;
	static int noOfTigerReservedCenters;
	String forestOfficer;
	String location;


	 ForestsInIndia(){
	 	System.out.println("This is Default constructor");
	 }

	 ForestsInIndia(String forestOfficer){
	 	this();
	 	this.forestOfficer=forestOfficer;
	 	System.out.println("Forest Officer : "+forestOfficer);
	 }

	 ForestsInIndia(String forestOfficer,String location){
	 	this(forestOfficer);
	 	this.location=location;
	 	System.out.println("Location : "+location);
	 }

	static{
		 nameOfForest="Sahyadri";
	 	 noOfRivers=25;
	 	 noOfTigerReservedCenters=50;
	}




}