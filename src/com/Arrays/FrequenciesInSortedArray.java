package com.Arrays;

class FrequenciesInSortedArray {
	public static void main(String[] args) {
		int [] arr = {1,2,2,2,3,3,4,4,5,5,5,5,6,6,7,8,9,9,9};
		frequencies(arr);
	}
	
	static void frequencies(int[] arr) {
		int temp = arr[0];
		int freq = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1] && i==arr.length-1) {
				temp=arr[i];
				System.out.println(temp+ " " + 1);
			}
			if(arr[i]==arr[i-1] && i==arr.length-1) {
				temp=arr[i];
				freq++;
				System.out.println(temp+ " " + freq);
			}
			if(arr[i]!=arr[i-1] ) {
				System.out.println(temp+ " " + freq);
				temp = arr[i];
				freq =1;
			}
			else {
				freq++;
			}
		}
	}
}
