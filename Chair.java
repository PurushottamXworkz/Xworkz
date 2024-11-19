class Chair{
	String brandOfChair;
	char sizeOfChair;
	boolean moveableChair;
	int noOfWheels;
	float costOfChair;
	byte restingHandsOfChair;
	short heightOfChair;

	Chair(){
		System.out.println("------This is No Arguement Counstructor--------");
	}
	Chair(String brandOfChair,
	char sizeOfChair,
	boolean moveableChair,
	int noOfWheels,
	float costOfChair,
	byte restingHandsOfChair,
	short heightOfChair){
		this.brandOfChair=brandOfChair;
		this.sizeOfChair=sizeOfChair;
		this.moveableChair=moveableChair;
		this.noOfWheels=noOfWheels;
		this.costOfChair=costOfChair;
		this.restingHandsOfChair=restingHandsOfChair;
		this.heightOfChair=heightOfChair;
	}
}