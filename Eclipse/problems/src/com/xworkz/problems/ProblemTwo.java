package com.xworkz.problems;

public class ProblemTwo {
	
	public static int maximum(int arr[],int size) {
		 int max = Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) 
				max=arr[i];
		}
		return max;
	}
	 
	public static void main(String[] args) {
		int arr[] = {5,6,7,3,2};
		int size=arr.length;
		int maxMountain=maximum(arr,size);
		System.out.println("Tallest mountain is :"+maxMountain);
	}
}
