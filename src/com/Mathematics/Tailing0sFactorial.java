package com.Mathematics;

class Tailing0sFactorial {
	public static void main(String[] args) {
		System.out.println(efficient(50));
	}
	
	
	static int efficient(int a ) {
		int x = 0;
		int five = 5;
		while(a>0) {
			x+=a/five;
			a=a/5;
			five*=5;
		}
		return x;
	}
}
