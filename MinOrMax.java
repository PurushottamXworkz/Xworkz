// Minimum value and maximum value in an array
class MinOrMax{
	public static void main(String args[]){
	int arr[] ={32,43,2,65,89,9};
	int min = arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
	System.out.println("Minmum value is : "+min);
	int max =arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	System.out.println("Maximum value is : "+max);
	}
}