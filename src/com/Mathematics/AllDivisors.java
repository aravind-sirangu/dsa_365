package com.Mathematics;

class AllDivisors {
	public static void main(String[] args) {
		alldiv(64);
	}
	
	static void alldiv(int n) {
		int temp = n;
		for(int i =1; i*i<=n; i++) {
			if(temp%i == 0 ) {
				if(temp/i==i) {
					System.out.println(i);
					continue;
				}
				System.out.println(i + " "+n/i);
			}
			
			
		}
	}

}
