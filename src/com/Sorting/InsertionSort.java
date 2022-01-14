package com.Sorting;

import java.util.Arrays;

class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {20,5,40,60,10,30};
		System.out.println(Arrays.toString(insertion(arr)));
	}
	
	
	static int[] insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && (arr[j]>key)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			System.out.print(Arrays.toString(arr) + "   ");
		}
		return arr;
	}
	
}
