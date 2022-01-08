package com.Searching;

class PeakElement {
	public static void main(String[] args) {
		int[] arr = {5,20,40,30,20,50,60};
		System.out.println(peak(arr));
	}
	
	static int peak(int[] arr) {
		int n = arr.length;
		int low =0;
		int high = n-1;
		while(high>=low) {
			int mid = (high+low)/2;
			if((mid==0 || arr[mid]>arr[mid+1]) && (mid==n-1 || arr[mid]>arr[mid+1])) {
				return mid;
			}
			if(mid>0 && arr[mid]>arr[mid-1]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
}
