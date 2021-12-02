package com.Mathematics;

class PalindromeNumbers {
	public static void main(String[] args) {
		System.out.println(palindrome(123214));
	}
	
	static boolean palindrome(int a) {
		int rev =0;
		int x = a;
		while(a>0) {
			rev = rev*10+(a%10);
			a= a/10;
		}
		return (x==rev);
	}
}
