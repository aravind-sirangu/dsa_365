package com.Mathematics;

class PrimeFactors {
	public static void main(String[] args) {
		primeFactors(52);;
	}
	
	static void primeFactors(int n) {
		if(n<=1) return;
		for(int i=2; i*i<n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}
		System.out.println(n);;
	}
	
}
