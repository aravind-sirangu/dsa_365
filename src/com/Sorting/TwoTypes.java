package com.Sorting;

import java.util.Arrays;

class TwoTypes {
	public static void main(String[] args) {
		int[] arr = {8,-1,6,-5,3,-3,-4,9,5};
		positiveNegative(arr, 0, 8);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {1,8,3,6,4,8,5,9,14};
		oddEveen(arr1, 0, 8);
		System.out.println(Arrays.toString(arr1));
	}
	
	static void positiveNegative(int[] arr, int l, int h) {
		int p =0;
		int i = l-1;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]<p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	static void oddEveen(int[] arr, int l, int h) {
		int i = l-1;
		int j = h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]%2==1);
			do {
				j--;
			}while(arr[j]%2==0);
			if(i>=j) {
				return;
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
	
}
