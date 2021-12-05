package com.Mathematics;

class HCF {
	public static void main(String[] args) {
		System.out.println(recursive(10, 50));
	}
	
	static int recursive(int a, int b) {
		if(b==0) return a;
		return recursive( b, a%b);
	}
}
