package com.Sorting;

import java.util.Arrays;

class QuickSortLumuto {
	public static void main(String[] args) {
		int[] arr = {8,3,6,9,4,5,2,7,1};
		quickSort(arr, 0, 8);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = lumuto(arr,l,h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
			
		}
		
	}
	
	static int lumuto(int[] arr, int l, int h) {
		int p = arr[h];
		int i = l-1;
		for (int j = l; j < h; j++) {
			if(arr[j]<p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}
	
}
