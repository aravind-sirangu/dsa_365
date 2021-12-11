package com.Mathematics;

class PrimeDivisors {
	public static void main(String[] args) {
		primeDivisors(21);
	}

	static void primeDivisors(int n) {
		int a = n;
		if(a%2==0) {
			System.out.println(2);
			while(a%2==0) {
				a=a/2;
			}
		}
		a=n;
		if(a%3==0) {
			System.out.println(3);
			while(a%3==0) {
				a=n/3;
			}
		}
		System.out.println(n);
		for(int i=5; i<n; i+=6) {
			if(n%i==0) {
				System.out.println(i);
				while(n%i==0) {
					n=n/i;
				}
			}
		}
	}

}
