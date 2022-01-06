package com.Searching;

class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(iterative(arr, 4));
		System.out.println(recursive(arr, 4, 8, 0));
	}
	
	static int iterative(int[] arr, int n) {
		int low =0;
		int high = arr.length-1;
		while(low<=high) {
			int mid =(high+low)/2;
			if(arr[mid]==n) return mid;
			else if (arr[mid]<n) {
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	
	static int recursive(int[] arr, int n, int high, int low) {
		if(high<low) return -1;
		int mid = (high+low)/2;
		if(arr[mid]==n) return mid;
		else if (arr[mid]<n) {
			return recursive(arr, n, high, mid+1);
		}
		else {
			return recursive(arr, n, mid-1, low);
		}
		
	}
}
