package com.xworkz.problems;

public class ProblemOne {
	
	static boolean search(int arr[],int size,int key) {
		for(int i=0;i<size;i++) {
			if(arr[i]==key)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
	
		int arr[]= {2,3,4,5,6};
		int s=arr.length;
		int x=4;
		boolean found = search(arr,s,x);
		if(found)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
