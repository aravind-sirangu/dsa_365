package com.Sorting;

import java.util.Arrays;

class LumutoPartition {
	
	public static void main(String[] args) {
		int[] arr = {10,80,30,90,40,50,70};
		lumuto(arr, 0, 6);
	}
	
	static void lumuto(int[] arr, int l, int h) {
		int p = arr[h];
		int i=l-1;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]<p) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i]; 
				arr[i]= temp;
			}
		}
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;

		System.out.println(Arrays.toString(arr));
	}
	
}
