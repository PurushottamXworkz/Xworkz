class OrderMedicine{
	public static void main(String args[]){
		Medicine medicine= new Medicine("Cough medicines",105,Order.IN_PERSON,
			Prescription.AVAILABLE,Instock.INSTOCK);

		System.out.println(medicine.nameOfMedicine);
		System.out.println(medicine.cost);
		System.out.println(medicine.order);
		System.out.println(medicine.prescription);
		System.out.println(medicine.instock);

	}
}