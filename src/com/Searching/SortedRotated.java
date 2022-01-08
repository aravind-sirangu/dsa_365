package com.Searching;

class SortedRotated {
	public static void main(String[] args) {
		int [] arr = {100,200,400,1000,10,20};
		System.out.println(SortedRotated(arr, 200));
	}
	
	static int SortedRotated(int[] arr, int x) {
		int n = arr.length;
		int low = 0;
		 int high = n-1;
		 while(high>=low) {
			 int mid = (high+low)/2;
			 if(arr[mid]==x) {
				 return mid;
			 }
			 else if(arr[low]<arr[mid]) {
				 if(x>=arr[low] && x<arr[mid]) {
					 high = mid-1;
				 }
				 else {
					low=mid+1;
				}
			 }
			 else {
				 if(x>=arr[mid] && x<arr[high]) {
					 high = mid-1;
				 }
				 else {
					low=mid+1;
				}
			 }
		 }
		 return -1;
	}
	
}
