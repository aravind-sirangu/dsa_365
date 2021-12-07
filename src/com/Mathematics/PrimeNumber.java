package com.Mathematics;

class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(checkPrime(7));
	}
	
	static boolean checkPrime(int n) {
		if(n==1 || n==0) return false;
		if(n==2 || n==3) return true;
		for(int i=5; i*i<n; i+=6) {
			if(n%(i)==0 || n%(i+2)==0) return false;
		}
		return true;
	}

}
