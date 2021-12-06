package com.Mathematics;

class LCM {
	public static void main(String[] args) {
		System.out.println(lcm(20, 250));
	}
	
	static int hcf(int a, int b) {
		if(b==0) return a;
		return hcf(b, a%b);
	}
	
	static int lcm(int a, int b) {
		return (a*b)/hcf(a, b);
	}
	
}
