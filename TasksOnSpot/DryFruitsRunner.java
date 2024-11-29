class DryFruitsRunner{
	public static void main(String[] args) {
		DryFruits dry=new DryFruits("Casheow","Magiceo",273.99f,Address.CANADA,Calory.HUNDRED_POUND);
		System.out.println(dry.nameOfDryFruit);
		System.out.println(dry.distibuted);
		System.out.println(dry.price);
		System.out.println(dry.address);
		System.out.println(dry.itsCalory);
	}
}