package com.Arrays;

class Reverse {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,17,8,9};
		System.out.println(checkSorted(arr));
		int[] rev = reverseArray(arr);
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + " ");
		}
	}
	
	
	static boolean checkSorted(int[] arr) {
		if(arr.length==1) return true;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}
	
	static int[] reverseArray(int[] arr) {
		int high = arr.length-1;
		int low =0;
		while(high>low) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
		return arr;
	}
	
}
