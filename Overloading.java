//Method Overloading



class Overloading{

	public static void main(String args[]){
	area(5);
	area(5,10);
	area(6.0f,5);
	}

	public static void area(int r){
	 System.out.println("Area of Circle is : "+3.142*r*r);
	} 

	public static void area(int l,int b){
	 System.out.println("Area of rectangle is : "+l*b);
	} 

	public static void area(float b,int h){
	 System.out.println("Area of triangle is : "+0.5*h*b);
	} 
	
}