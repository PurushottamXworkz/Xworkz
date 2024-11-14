/*class ArrayTask {
    public static void main(String[] args) {
        System.out.println("Array Task");
        String array[] ={"Laptop","Mouse","CPU","Cable","Keyboard"};
        System.out.println("Address of Array == "+array);
        System.out.println("Array Elements ");
         System.out.println("Array length == "+array.length);
        System.out.println("1st element= " +array[0]);
        System.out.println("2nd element= " +array[1]);
        System.out.println("3rd element= " +array[2]);
        System.out.println("4th element= " +array[3]);
        System.out.println("5th element= " +array[4]);
        
    }
}

*/




class ArrayTask {
    public static void main(String[] args) {
    System.out.println("Array Task");
    String array[] ={"Laptop","Mouse","CPU","Cable","Keyboard"};
        
    System.out.println("Array Elements in order");

    for(int i=0;i<array.length;i++){
	System.out.println(" Element = "+i +" is ="+array[i]);
	}

	System.out.println("Reverse order of array");
	for(int i=array.length-1;i>=0;i--){
	System.out.println(" Element = "+i +" is ="+array[i]);
	} 

    System.out.println("first to middle of array");
    for(int i=0;i<=array.length/2;i++){
    System.out.println(" Element = "+i +" is ="+array[i]);
    }

    System.out.println("Middle to last of array");
    for(int i=array.length/2;i<=array.length-1;i++){
    System.out.println(" Element = "+i +" is ="+array[i]);
    }

    System.out.println("Skipping first index of array");
    for(int i=1;i<array.length;i++){
    System.out.println(" Element = "+i +" is ="+array[i]);
    }

    System.out.println("last to middle of array");
    for(int i=array.length-1;i>=array.length/2;i--){
    System.out.println(" Element = "+i +" is ="+array[i]);
    }

    }
}




