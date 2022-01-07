package com.Searching;

class SearchingInfiniteSizedArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(infinite(arr, 7));
	}
	
	static int infinite(int[] arr, int x) {
		if(arr[0]==x) return 0;
		int i =1;
		while(arr[i]<x) {
			i= i*2;
		}
		return binarySearch(arr, i, i/2, x);
		
	}
	
	static int binarySearch(int[] arr, int high, int low, int x) {
		while(high>=low) {
			int mid = (high+low)/2;
			if(arr[mid]==x) return mid;
			else if (arr[mid]>x) {
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	
}
