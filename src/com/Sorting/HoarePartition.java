package com.Sorting;

import java.util.Arrays;

class HoarePartition {
	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2,7,1,10};
		hoare(arr, 0, 7);
	}
	
	static int hoare(int[] arr, int l, int h) {
		int p = arr[l];
		int i =l-1;
		int j = h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<p);
			do {
				j--;
			}while(arr[j]>p);
			if(i>j) {
				System.out.println(Arrays.toString(arr));
				return j;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
	}
	
}
