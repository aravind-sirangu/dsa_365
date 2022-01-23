package com.Sorting;

import java.util.Arrays;

class ChocolateDistribution {
	public static void main(String[] args) {
		int[] arr = {2,9,7,1,6,4,3,8,5};
		System.out.println(chocDistribution(arr, 3));
	}
	
	static int chocDistribution(int[] arr, int m) {
		quickSort(arr, 0, arr.length-1);
		int res = 0;
		for (int i = 0; i < arr.length-m+1; i++) {
			res = Math.max(res, arr[i+m-1]-arr[i]);
		}
		return res;
	}

	
	static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = hoare(arr, l, h);
			System.out.println(p);
			quickSort(arr, l, p);
			quickSort(arr, p+1, h);
		}
	}
	
	static int hoare(int[] arr, int l, int h) {
		int p = arr[l];
		int i = l-1;
		int j = h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<p);
			do {										// 2 3 1 6 7 4 9 8 5
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
