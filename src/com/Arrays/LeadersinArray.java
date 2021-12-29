package com.Arrays;

class LeadersinArray {
	public static void main(String[] args) {
		int[] arr = {7,10,4,3,6,5,2};
		leaders(arr);
	}
	
	static void leaders(int[] arr) {
		int n = arr.length;
		System.out.println(arr[n-1]);
		int temp = arr[n -1];
		for (int i = n-2; i >0; i--) {
			if(arr[i]>=temp) {
				temp = arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}
