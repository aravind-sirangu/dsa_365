package com.Mathematics;

class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(500, 1));
	}
	
	static long factorial(int n,int fact) {
		if(n==0) return fact;
		return factorial(n-1, n*fact);
	}
}
