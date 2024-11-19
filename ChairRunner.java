class ChairRunner{
	public static void main(String args[]){
	Chair chair=new Chair();
	byte num1=2;
	short num2=5;
	Chair chair1=new Chair("Mangoo",'L',true,5,9999.99f,num1,num2);

	System.out.println(chair1.brandOfChair);
	System.out.println(chair1.sizeOfChair);
	System.out.println(chair1.moveableChair);
	System.out.println(chair1.noOfWheels);
	System.out.println(chair1.costOfChair);
	System.out.println(chair1.restingHandsOfChair);
	System.out.println(chair1.heightOfChair);


	Chair chair3=new Chair();

	byte num3=2;
	short num4=5;
	Chair chair2=new Chair("Ancious",'L',true,5,9099.99f,num3,num4);

	System.out.println(chair2.brandOfChair);
	System.out.println(chair2.sizeOfChair);
	System.out.println(chair2.moveableChair);
	System.out.println(chair2.noOfWheels);
	System.out.println(chair2.costOfChair);
	System.out.println(chair2.restingHandsOfChair);
	System.out.println(chair2.heightOfChair);
	
	

	}
}