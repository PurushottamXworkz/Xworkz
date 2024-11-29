// create one object
// 5 variables in class initialize all using constructor
// 2 are enum


class DryFruits{
	String nameOfDryFruit;
	String distibuted;
	float price;
	Address address;
	Calory itsCalory;

	DryFruits(){
		System.out.println("This is Default constructor");
	}
	DryFruits(String nameOfDryFruit){
		this.nameOfDryFruit=nameOfDryFruit;
		System.out.println("Name Of dry fruit : " +nameOfDryFruit);
	}

	DryFruits(String nameOfDryFruit,String distibuted){
		this(nameOfDryFruit);
		this.distibuted=distibuted;
		System.out.println("Distributed By : " +distibuted);
	}

	DryFruits(String nameOfDryFruit,String distibuted,float price){
		this(nameOfDryFruit,distibuted);
		this.price=price;
		System.out.println("Price : " +price);
	}

	DryFruits(String nameOfDryFruit,String distibuted,float price,Address address){
		this(nameOfDryFruit,distibuted,price);
		this.address=address;
		System.out.println("Address : " +address);
	}

	DryFruits(String nameOfDryFruit,String distibuted,float price,Address address,Calory itsCalory){
		this(nameOfDryFruit,distibuted,price,address);
		this.itsCalory=itsCalory;
		System.out.println("Calory : " +itsCalory);
	}
}