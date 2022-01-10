package com.Searching;

class MinimumPages {
	public static void main(String[] args) {
		int[] arr = {10,20,30,10};
		System.out.println(minPages(arr, 2));
	}
	
	static int minPages(int[] arr, int k) {
		int sum = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			sum+=arr[i];
			max = Math.max(max, arr[i]);
		}
		int high = sum;
		int low = max;
		int res =0;
		while(high>=low) {
			int mid = (high+low)/2;
			if(isFeasible(arr,k,mid)) {
				res = mid;
				high = mid-1;
			}
			else {
				low+=1;
			}
		}
		return res;
	}
	
	
	static boolean isFeasible(int[] arr, int k, int mid) {
		int req =0;
		int sum=arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum+=arr[i];
			if(sum>mid) {
				req++;
				sum = arr[i];
			}
		}
		if(req<=k) {
			return true;
		}
		return false;
	}
	
	
}
