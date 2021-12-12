package com.Mathematics;

class PowerComputing {
	public static void main(String[] args) {
		System.out.println(power(12, 3));
	}
	
	static int power(int n, int x) {
		if(x==0) {
			return 1;
		}
		int temp = power(n, x/2);
		if(x%2==0) {
			return temp*temp;
		}
		else {
			return temp*temp*n;
		}
	}
}
