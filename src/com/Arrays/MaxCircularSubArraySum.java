package com.Arrays;

class MaxCircularSubArraySum {
	public static void main(String[] args) {
//		int[] arr = {5,-2,3,4};
		int[] arr = {3,-4,5,6,-8,7};
		System.out.println(maxCirSum(arr));
	}
	
	
	static int maxCirSum(int[] arr) {
		int temp = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i=1;i<arr.length;i++) {
			temp = Math.min(temp, temp+arr[i]);
			min = Math.min(min, arr[i]);
			sum+=arr[i];
		}
		return sum-min;
	}
	
}
