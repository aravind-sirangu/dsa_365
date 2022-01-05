package com.Arrays;

import javax.xml.transform.Templates;

class MaxConsecutiveFlips {
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,0,1,0,0,1,1,0,1,1,1};
		int [] arr1 = {0,0,1,1,0,0,1,0,0,1,0,1,0,1};
		System.out.println(flips(arr));
	}
	
	static int flips(int[] arr) {
		int n = arr.length;
		int temp;
		if(arr[0]==arr[n-1]) {
			temp = arr[0] == 0 ? 1 : 0;
		}
		else {
			temp = 0;
		}
		
		int count = (arr[0]==temp) ? 1 : 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] !=arr[i-1] && arr[i]==temp) {
				count++;
			}
		}
		return count;
	}
	
}
