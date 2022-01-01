package com.Arrays;

class MajorityElement {
	public static void main(String[] args) {
//		int[] arr = {8,3,4,8,8,8};
		int[] arr = {1,2,3,4,5,4,5,4,7,4,4};
		System.out.println(majority(arr));
	}
	
	static int majority(int[] arr) {
		int count =1;
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]==temp) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				temp = arr[i];
				count=1;
			}
		}
		int count2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==temp) {
				count2++;
			}
		}
		
		if(count2>arr.length/2) {
			return temp;
		}
		return -1;
	}
	
}
