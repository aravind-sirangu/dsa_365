package com.Sorting;

import java.util.Arrays;

class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {1,5,3,6,2,7,9,8,4};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
	
	
	static int[] selectionSort(int[] arr) {
		int n = arr.length;
		int[] res = new int[n];
		
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
}
