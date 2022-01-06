package com.Searching;

class FirstAndLastOccorences {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,6,6,6,7};
		System.out.println(last(arr, 6));
	}
	
	static int first(int[] arr, int n) {
		int high = arr.length;
		int low =0;
		while(high>=low) {
			int mid=(low+high)/2;
			if((arr[mid]==n && mid==0) || (arr[mid]==n && arr[mid-1] !=n)   ) {
				return mid;
			}
			else if(arr[mid]>n) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	
	static int last(int[] arr, int n) {
		int high = arr.length;
		int low =0;
		while(high>=low) {
			int mid=(low+high)/2;
			if((arr[mid]==n && mid==arr.length) ||(arr[mid]==n && arr[mid+1] !=n)) {
				return mid;
			}
			else if(arr[mid]<n) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
}
