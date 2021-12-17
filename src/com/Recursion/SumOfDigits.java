package com.Recursion;

class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumofdig(2156, 0));
	}
	
	static int sumofdig(int n, int sum) {
		if(n>0 && n<9) return n+sum;
		sum+=n%10;
		return sumofdig(n/10, sum);
	}
}
