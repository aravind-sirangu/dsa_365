package com.Arrays;

class LongestEvenOddSubArray {
	public static void main(String[] args) {
//		int[] arr= {10,12,14,7,8};
		int[] arr = {10,12,14,16};
		System.out.println(evenodd(arr));
	}
	
	static int evenodd(int[] arr) {
		int res=1;
		int temp =1;
		for (int i = 1; i < arr.length; i++) {
			if((arr[i] + arr[i-1])%2!=0) {
				temp++;
				res = Math.max(temp, res);
			}
			else {
				temp=1;
			}
		}
		return res;
	}
	
}
