package com.Arrays;

class TrappingRainWater {
	public static void main(String[] args) {
//		int[] arr = {3,0,1,2,5};
//		int[] arr = {2,0,2}; 
		int[] arr = {3,2,1};
		System.out.println(trappingRain(arr));
	}
	
	
	static int trappingRain(int[] arr) {
		int n = arr.length;
		int res = 0;
		int left = arr[0];
		int right = arr[n-1];
		for (int i = 1; i < arr.length; i++) {
			left = Math.max(left, arr[i-1]);
//			System.out.println("hell " + left + "I " + arr[i]);
			for(int j=i+1;j<n;j++) {
				right = Math.max(arr[j], right);
//				System.out.println("hello " + right + "I " + arr[i]);
			}
			if(arr[i]< Math.min(right, left)) {
				res+=Math.min(right, left)-arr[i];
//				System.out.println("hehe " + res + "I " + arr[i]);
			}
		}
		return res;
	}
}
