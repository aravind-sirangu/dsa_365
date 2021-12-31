package com.Arrays;

class MaxConsecutive1s {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,1,0};
		System.out.println(max1s(arr));
	}
	
	static int max1s(int[] arr ) {
		int res =0;
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				temp++;
				res=Math.max(temp, res);
			}
			else {
				temp=0;
			}
		}
		return res;
	}
	
}
