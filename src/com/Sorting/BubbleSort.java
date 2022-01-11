package com.Sorting;

import java.util.Arrays;

class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,5,6,7,1,3,4,6,9};
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
	}
	
	static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length-1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
		
		return arr;
	}
	
}
