package com.Sorting;

import java.util.Arrays;

class ThreeTypesSort {
	public static void main(String[] args) {
		int[] arr = {2,1,2,2,0,0,1,0,2};
		zeroOneTwo(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void zeroOneTwo(int[] arr) {
		int l=0;
		int mid=0;
		int h =arr.length-1;
		while(mid<h) {
			if(arr[mid]==0) {
				mid++;
				l++;
			}
			else if (arr[mid] == 1) {
				mid++;
				int temp = arr[mid];
				arr[mid] = arr[l];
				arr[l] = arr[mid];
			}
			else {
				int temp = arr[h];
				arr[h] = arr[mid];
				arr[mid] = temp;
				h--;
				
			}
		}
	}
	
	
}
