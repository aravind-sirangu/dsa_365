package com.Arrays;

class MaxSubArraySum {
	public static void main(String[] args) {
		int[] arr = {5,8,3};
		System.out.println(suarraysum(arr));
	}
	
	
	static int suarraysum(int[] arr) {
		int res = arr[0];
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			temp = Math.max(temp+arr[i], arr[i]);
			res = Math.max(res, temp);
		}
		return res;
	}

}
