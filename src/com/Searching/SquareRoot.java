package com.Searching;

class SquareRoot {
	public static void main(String[] args) {
		System.out.println(squareRoot(100));
	}
	
	static int squareRoot(int n) {
		int low = 1;
		int high = n;
		int ans = 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if ((mid*mid)>n) {
				high = mid-1;
			}
			else {
				low=mid+1;
				ans = mid;
			}
		}
		return ans;
	}
	
}
