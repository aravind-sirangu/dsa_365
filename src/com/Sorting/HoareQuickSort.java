package com.Sorting;

import java.util.Arrays;

class HoareQuickSort {
	
	public static void main(String[] args) {
		int[] arr = {6,8,3,4,9,2,7,1,5};
		quickSort(arr, 0,8);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = hoare(arr, l,h);
			quickSort(arr, l, p);
			quickSort(arr, p+1, h);
		}
	}
	
	
	static int hoare(int[] arr, int l, int h) {
		int p = arr[l];
		int i=l-1;
		int j = h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<p);
			do {
				j--;
			}while(arr[j]>p);
			if(i>=j) {
				System.out.println(Arrays.toString(arr));
				return j;
			}

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			
		}
		
	}
	
}
