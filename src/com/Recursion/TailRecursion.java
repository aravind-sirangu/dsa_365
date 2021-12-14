package com.Recursion;

class TailRecursion {
	// The recursive call is made in last line, modern compilers optimize it using tail call elimination
	public static void main(String[] args) {
		tailOne(20,1);
	}
	
	static void tail(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		tail(n-1);
	}
	
	static void tailOne(int n, int k) {
		if(n==0) {
			return;
		}
		System.out.println(k);
		tailOne(n-1,k+1);
	}
	
	
}
