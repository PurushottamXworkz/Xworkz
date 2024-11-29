class Laptop{
	int seconds;
	int second;
	public static void turnOn(){
		System.out.println("Turn On Machine");
	}
	public static void turnOn(int seconds){
		System.out.println("Turn On Machine : "+seconds);
	}
	public static void turnOn(int seconds,int second){
		System.out.println("Turn On Machine : " +seconds + " Turn On Machine : "+second );
	}

	public static void main(String[] args) {
		turnOn();
		turnOn(1);
		turnOn(1,2);
	}
}
