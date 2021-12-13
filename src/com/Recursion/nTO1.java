package com.Recursion;

class nTO1 {

	public static void main(String[] args) {
		nToOne(20);
		oneToN(20, 1);
	}
	
	static void nToOne(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n); 
		nToOne(n-1);;
	}
	
	static void oneToN(int n, int a) {
		if(a==n+1) {
			return;
		}
		System.out.println(a);
		oneToN(n, a+1);
	}
}
