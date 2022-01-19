package com.Sorting;

import java.util.Arrays;

class NaivePartition {
	public static void main(String[] args) {
		int[] arr = {2,4,6,9,1,3,7,8,5};
		System.out.println(partition(arr, 0, 8, 6));
	}
	
	
	static int partition(int[] arr, int l, int r, int p) {
		int n = r-l+1;
		int[] temp = new int[n];
		int index=0;
		for (int i = l; i < r; i++) {
			if(arr[i]<p) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		for (int j=l; j < r; j++) {
			if(arr[j]==p) {
				temp[index] = arr[j];
				index++;
			}
		}
		int res = l+index-1;
		
		for (int i = l; i < r; i++) {
			if(arr[i]>p) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		for (int i = l; i < r; i++) {
			arr[i] = temp[i];
		}
		System.out.println(Arrays.toString(arr));
		return res;
	}
}
