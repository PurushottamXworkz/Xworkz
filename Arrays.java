// Create 2 arrays in each way for all datatypes 
// Each array should have 10 values atleast
// reassign values 
// printall the values from array
class Arrays{
	public static void main(String args[]){
		byte[] noOfPensInBox={12,10,20,19,18,13,16,18,10,8};
		byte[] pensInBox=new byte[10];

		System.out.println("Bytes values");
		System.out.println(noOfPensInBox[0]);
		System.out.println(noOfPensInBox[1]);
		System.out.println(noOfPensInBox[2]);
		System.out.println(noOfPensInBox[3]);
		System.out.println(noOfPensInBox[4]);
		System.out.println(noOfPensInBox[5]);
		System.out.println(noOfPensInBox[6]);
		System.out.println(noOfPensInBox[7]);
		System.out.println(noOfPensInBox[8]);
		System.out.println(noOfPensInBox[9]);


		System.out.println("Reassigned Bytes values");
		System.out.println(pensInBox[0]=noOfPensInBox[9]);
		System.out.println(pensInBox[1]=noOfPensInBox[8]);
		System.out.println(pensInBox[2]=noOfPensInBox[7]);
		System.out.println(pensInBox[3]=noOfPensInBox[6]);
		System.out.println(pensInBox[4]=noOfPensInBox[5]);
		System.out.println(pensInBox[5]=noOfPensInBox[4]);
		System.out.println(pensInBox[6]=noOfPensInBox[3]);
		System.out.println(pensInBox[7]=noOfPensInBox[2]);
		System.out.println(pensInBox[8]=noOfPensInBox[1]);
		System.out.println(pensInBox[9]=noOfPensInBox[0]);




		short[] noOfAssets={2000,2100,3217,3333,9807,1084,9382,984,2374,3487};
		short[] assetsInOffice = new short[10];

		System.out.println("Short values");
		System.out.println(noOfAssets[0]);
		System.out.println(noOfAssets[1]);
		System.out.println(noOfAssets[2]);
		System.out.println(noOfAssets[3]);
		System.out.println(noOfAssets[4]);
		System.out.println(noOfAssets[5]);
		System.out.println(noOfAssets[6]);
		System.out.println(noOfAssets[7]);
		System.out.println(noOfAssets[8]);
		System.out.println(noOfAssets[9]);


		System.out.println("Reassigned Short values");
		System.out.println(assetsInOffice[0]=noOfAssets[9]);
		System.out.println(assetsInOffice[1]=noOfAssets[8]);
		System.out.println(assetsInOffice[2]=noOfAssets[7]);
		System.out.println(assetsInOffice[3]=noOfAssets[6]);
		System.out.println(assetsInOffice[4]=noOfAssets[5]);
		System.out.println(assetsInOffice[5]=noOfAssets[4]);
		System.out.println(assetsInOffice[6]=noOfAssets[3]);
		System.out.println(assetsInOffice[7]=noOfAssets[2]);
		System.out.println(assetsInOffice[8]=noOfAssets[1]);
		System.out.println(assetsInOffice[9]=noOfAssets[0]);


		int booksInLibrary[] ={12000,15000,20000,784,998540,44400,5642,1500,4440,98750};
		int[] booksInStore = new int[10];


		System.out.println("Int values");
		System.out.println(booksInLibrary[0]);
		System.out.println(booksInLibrary[1]);
		System.out.println(booksInLibrary[2]);
		System.out.println(booksInLibrary[3]);
		System.out.println(booksInLibrary[4]);
		System.out.println(booksInLibrary[5]);
		System.out.println(booksInLibrary[6]);
		System.out.println(booksInLibrary[7]);
		System.out.println(booksInLibrary[8]);
		System.out.println(booksInLibrary[9]);


		System.out.println("Reassigned Int values");
		System.out.println(booksInStore[0]=booksInLibrary[9]);
		System.out.println(booksInStore[1]=booksInLibrary[8]);
		System.out.println(booksInStore[2]=booksInLibrary[7]);
		System.out.println(booksInStore[3]=booksInLibrary[6]);
		System.out.println(booksInStore[4]=booksInLibrary[5]);
		System.out.println(booksInStore[5]=booksInLibrary[4]);
		System.out.println(booksInStore[6]=booksInLibrary[3]);
		System.out.println(booksInStore[7]=booksInLibrary[2]);
		System.out.println(booksInStore[8]=booksInLibrary[1]);
		System.out.println(booksInStore[9]=booksInLibrary[0]);
		

		float areaOfPlots[]={1200.50f,2400.90f,1400.50f,2100.90f,780.50f,900.90f,400.50f,800.90f,900.50f,780.00f};
		float totalAreaOfPlots[]= new float[10];

		System.out.println("Float values");
		System.out.println(areaOfPlots[0]);
		System.out.println(areaOfPlots[1]);
		System.out.println(areaOfPlots[2]);
		System.out.println(areaOfPlots[3]);
		System.out.println(areaOfPlots[4]);
		System.out.println(areaOfPlots[5]);
		System.out.println(areaOfPlots[6]);
		System.out.println(areaOfPlots[7]);
		System.out.println(areaOfPlots[8]);
		System.out.println(areaOfPlots[9]);


		System.out.println("Reassigned float values");
		System.out.println(totalAreaOfPlots[0]=areaOfPlots[9]);
		System.out.println(totalAreaOfPlots[1]=areaOfPlots[8]);
		System.out.println(totalAreaOfPlots[2]=areaOfPlots[7]);
		System.out.println(totalAreaOfPlots[3]=areaOfPlots[6]);
		System.out.println(totalAreaOfPlots[4]=areaOfPlots[5]);
		System.out.println(totalAreaOfPlots[5]=areaOfPlots[4]);
		System.out.println(totalAreaOfPlots[6]=areaOfPlots[3]);
		System.out.println(totalAreaOfPlots[7]=areaOfPlots[2]);
		System.out.println(totalAreaOfPlots[8]=areaOfPlots[1]);
		System.out.println(totalAreaOfPlots[9]=areaOfPlots[0]);


		double[] priceOfAssets={80000.999d,98000.50d,999.780d,870.444d,854.954d,745.213d,974521.5421d,78965.1234d,5546.213d,7843.093d};
		double[] budgetofAssets=new double[10];

		System.out.println("Double values");
		System.out.println(priceOfAssets[0]);
		System.out.println(priceOfAssets[1]);
		System.out.println(priceOfAssets[2]);
		System.out.println(priceOfAssets[3]);
		System.out.println(priceOfAssets[4]);
		System.out.println(priceOfAssets[5]);
		System.out.println(priceOfAssets[6]);
		System.out.println(priceOfAssets[7]);
		System.out.println(priceOfAssets[8]);
		System.out.println(priceOfAssets[9]);


		System.out.println("Reassigned Double values");
		System.out.println(budgetofAssets[0]=priceOfAssets[9]);
		System.out.println(budgetofAssets[1]=priceOfAssets[8]);
		System.out.println(budgetofAssets[2]=priceOfAssets[7]);
		System.out.println(budgetofAssets[3]=priceOfAssets[6]);
		System.out.println(budgetofAssets[4]=priceOfAssets[5]);
		System.out.println(budgetofAssets[5]=priceOfAssets[4]);
		System.out.println(budgetofAssets[6]=priceOfAssets[3]);
		System.out.println(budgetofAssets[7]=priceOfAssets[2]);
		System.out.println(budgetofAssets[8]=priceOfAssets[1]);
		System.out.println(budgetofAssets[9]=priceOfAssets[0]);

		long[] mobileNum={8088204455l,8296424985l,8762778500l,9110461416l,7854681234l,8088224455l,8196424985l,8062778500l,9910461416l,7954681234l};
		long mobileNumbers[]=new long[10];

		System.out.println("Double values");
		System.out.println(mobileNum[0]);
		System.out.println(mobileNum[1]);
		System.out.println(mobileNum[2]);
		System.out.println(mobileNum[3]);
		System.out.println(mobileNum[4]);
		System.out.println(mobileNum[5]);
		System.out.println(mobileNum[6]);
		System.out.println(mobileNum[7]);
		System.out.println(mobileNum[8]);
		System.out.println(mobileNum[9]);


		System.out.println("Reassigned Double values");
		System.out.println(mobileNumbers[0]=mobileNum[9]);
		System.out.println(mobileNumbers[1]=mobileNum[8]);
		System.out.println(mobileNumbers[2]=mobileNum[7]);
		System.out.println(mobileNumbers[3]=mobileNum[6]);
		System.out.println(mobileNumbers[4]=mobileNum[5]);
		System.out.println(mobileNumbers[5]=mobileNum[4]);
		System.out.println(mobileNumbers[6]=mobileNum[3]);
		System.out.println(mobileNumbers[7]=mobileNum[2]);
		System.out.println(mobileNumbers[8]=mobileNum[1]);
		System.out.println(mobileNumbers[9]=mobileNum[0]);

		char[] alphabet={'A','K','J','S','V','N','P','R','E','B'};
		char[] letters=new char[10];

		System.out.println("Char values");
		System.out.println(alphabet[0]);
		System.out.println(alphabet[1]);
		System.out.println(alphabet[2]);
		System.out.println(alphabet[3]);
		System.out.println(alphabet[4]);
		System.out.println(alphabet[5]);
		System.out.println(alphabet[6]);
		System.out.println(alphabet[7]);
		System.out.println(alphabet[8]);
		System.out.println(alphabet[9]);


		System.out.println("Reassigned Char values");
		System.out.println(letters[0]=alphabet[9]);
		System.out.println(letters[1]=alphabet[8]);
		System.out.println(letters[2]=alphabet[7]);
		System.out.println(letters[3]=alphabet[6]);
		System.out.println(letters[4]=alphabet[5]);
		System.out.println(letters[5]=alphabet[4]);
		System.out.println(letters[6]=alphabet[3]);
		System.out.println(letters[7]=alphabet[2]);
		System.out.println(letters[8]=alphabet[1]);
		System.out.println(letters[9]=alphabet[0]);

		boolean[] availabiltyOfBooks={true,false,true,true,false,false,true,true,false,true};
		boolean[] availabilty=new boolean[10]; 

		System.out.println("Boolean values");
		System.out.println(availabiltyOfBooks[0]);
		System.out.println(availabiltyOfBooks[1]);
		System.out.println(availabiltyOfBooks[2]);
		System.out.println(availabiltyOfBooks[3]);
		System.out.println(availabiltyOfBooks[4]);
		System.out.println(availabiltyOfBooks[5]);
		System.out.println(availabiltyOfBooks[6]);
		System.out.println(availabiltyOfBooks[7]);
		System.out.println(availabiltyOfBooks[8]);
		System.out.println(availabiltyOfBooks[9]);


		System.out.println("Reassigned Boolean values");
		System.out.println(availabilty[0]=availabiltyOfBooks[9]);
		System.out.println(availabilty[1]=availabiltyOfBooks[8]);
		System.out.println(availabilty[2]=availabiltyOfBooks[7]);
		System.out.println(availabilty[3]=availabiltyOfBooks[6]);
		System.out.println(availabilty[4]=availabiltyOfBooks[5]);
		System.out.println(availabilty[5]=availabiltyOfBooks[4]);
		System.out.println(availabilty[6]=availabiltyOfBooks[3]);
		System.out.println(availabilty[7]=availabiltyOfBooks[2]);
		System.out.println(availabilty[8]=availabiltyOfBooks[1]);
		System.out.println(availabilty[9]=availabiltyOfBooks[0]);



	}
}