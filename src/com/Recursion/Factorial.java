package com.Recursion;

class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5, 1));
	}
	
	static int fact(int n, int res) {
		if(n==0) return res;
		return fact(n-1, res*n);
	}
}
