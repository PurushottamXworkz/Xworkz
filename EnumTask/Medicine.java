class Medicine{
	String nameOfMedicine;
	float cost;
	Order order;
	Prescription prescription;
	Instock instock;

	Medicine(String nameOfMedicine,float cost,Order order,Prescription prescription,
	Instock instock){
		this.nameOfMedicine=nameOfMedicine;
		this.cost=cost;
		this.prescription=prescription;
		this.order=order;
		this.instock=instock;
	}

}