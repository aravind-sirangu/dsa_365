package com.Mathematics;

import java.util.Arrays;

class Sieve {
	public static void main(String[] args) {
		seive(151);
	}
	
	static void seive(int n) {
		boolean[] bool = new boolean[n];
		Arrays.fill(bool, true);
		for(int i=2;i<bool.length;i++) {
			if(bool[i]==true) {
				for (int j = 2*i; j < bool.length; j+=i) {
					bool[j] = false;
				}
			}
		}
		for (int k = 2; k < bool.length; k++) {
			if(bool[k]) {
				System.out.println(k);
			}
		}
	}
}
