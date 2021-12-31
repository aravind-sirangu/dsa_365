package com.Arrays;

class StockBuyAndSell {
	public static void main(String[] args) {
//		int[] arr = {1,5,3,8,12};
		int[] arr = {10,20,30};
		System.out.println(stock(arr));
	}
	
	static int stock(int[] arr) {
		int res =0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				res+=arr[i]-arr[i-1];
			}
			
		}
		return res;
	}
	
}
