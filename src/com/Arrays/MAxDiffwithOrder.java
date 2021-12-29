package com.Arrays;

class MAxDiffwithOrder {
	public static void main(String[] args) {
//		int[] arr = {2,3,10,6,4,8,1};
		
//		int[] arr = {30,10,8,2};
		
//		int[] arr = {10,20,30};
		
		int[] arr = {7,9,5,6,3,2};
		System.out.println(maxDiff(arr));
	}
	
	static int maxDiff(int[] arr) {
		int low= arr[0];
		int res = arr[1] - arr[0];
		for(int i=1; i<arr.length;i++) {
			low = Math.min(low, arr[i-1]);
			res = Math.max(res, arr[i]-low);
		}
		return res;
	}
}
