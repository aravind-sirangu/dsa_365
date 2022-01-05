package com.Arrays;

class PrefixSum {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		System.out.println(getSum(arr, 2, 3));
		
		int[] arr = {3,4,8,-9,20,6};
		System.out.println(equilibriumPoint(arr));
	}
	
	static int getSum(int[] arr, int a, int b) {
		int[] sumArr = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < sumArr.length; i++) {
			temp = temp+arr[i];
			sumArr[i] = temp;
		}
		return sumArr[b-1] - sumArr[a-2];
	}
	
	static int equilibriumPoint(int[] arr) {
		int[] sumArr = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < sumArr.length; i++) {
			temp = temp+arr[i];
			sumArr[i] = temp;
		}
		for (int i = 0; i < sumArr.length; i++) {
			if(sumArr[i]-arr[i] == sumArr[sumArr.length-1]-sumArr[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
