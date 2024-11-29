class PublicationRunner{
	public static void main(String[] args) {
		System.out.println("=================================================");
		ImprintPublication imprint=new ImprintPublication("Pappilon");
		System.out.println("=================================================");
		ImprintPublication imprint1=new ImprintPublication("Pappilon",45.0f);
		System.out.println("=================================================");
		System.out.println("Name of Publication : "+ImprintPublication.nameOfPublication);
		System.out.println("Address : "+ImprintPublication.address);
		System.out.println("Contact : "+ImprintPublication.contact);
		System.out.println("=================================================");
		System.out.println("Author : "+imprint.author);
		System.out.println("Price : $"+imprint.price);
		System.out.println("=================================================");
		System.out.println("Author : "+imprint1.author);
		System.out.println("Price : $"+imprint1.price);
		System.out.println("=================================================");
	}
}