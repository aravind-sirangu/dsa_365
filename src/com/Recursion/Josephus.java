package com.Recursion;

class Josephus {
	public static void main(String[] args) {
		System.out.println(josephusZero(7, 3));
	}
	
	
	static int josephusZero(int n, int k) {
		if(n==0) {
			return 0;
		}
		return (josephusZero(n-1, k)+k)%n;
	}
}
