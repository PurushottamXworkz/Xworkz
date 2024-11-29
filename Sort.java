// Reverse an array
// check if array is sorted or not

class Sort{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		for(int i=0;i<arr.length-1;i++){
			int next=i+1;
			if(arr[i]>=arr[next]){
				System.out.println("It is not sorted array");
				break;
			}	
		}
		System.out.println("It is sorted array");
	}
}