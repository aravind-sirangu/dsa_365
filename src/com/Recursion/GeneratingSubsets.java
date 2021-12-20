package com.Recursion;

class GeneratingSubsets {
	public static void main(String[] args) {
		stringsubsets("hello", "", 0);
	}
	
	static void stringsubsets(String str,String cur, int i) {
		if(i==str.length()) {
			System.out.println(cur);
			return;
		}
		
		stringsubsets(str, cur ,i+1);
		stringsubsets(str, cur+str.charAt(i) ,i+1);
	}
	
}
