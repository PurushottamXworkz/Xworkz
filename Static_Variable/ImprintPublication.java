class ImprintPublication{
	static String nameOfPublication;
	static String address;
	static long contact;
	String author;
	float price; 

	ImprintPublication(){
		System.out.println("This is default constructor");
	}

	ImprintPublication(String author){
		this();
		this.author=author;
		System.out.println("Author : "+author);
	}
	ImprintPublication(String author,float price){
		this(author);
		this.price=price;
		System.out.println("Price : "+price);
	}


	static {
	nameOfPublication="Imprint Of harper collins";
	address="New York";
	contact=+554715421;
	}
}




