package com.Searching;

class TwoPointerApproach {
	public static void main(String[] args) {
		int[] arr = {2,4,8,9,11,12,20,30};
//		System.out.println(pairSum(arr, 55, 0,7));
		System.out.println(tripletSum(arr, 55));
	}
	
	static boolean pairSum(int[] arr, int x, int low, int high) {
//		int low = 0;
//		int high = arr.length-1;
		while(high>low) {
			int sum =arr[high] + arr[low];
			if(sum==x) return true;
			else if (sum>x) {
				high--;
			}
			else {
				low++;
			}
		}
		return false;
	}
	
	
	static boolean tripletSum(int[] arr, int x) {
		
		for (int i = 0; i < arr.length; i++) {
			if(pairSum(arr, x-arr[i], i+1, arr.length-1)) return true;
		}
		return false;
	}
	
}
