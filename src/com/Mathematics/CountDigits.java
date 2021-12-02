package com.Mathematics;

public class CountDigits {
	
	
	public static void main(String[] args) {
		System.out.println(naiveCount(2333));
		CountDigits cd = new CountDigits();
		System.out.println(cd.efficientCount(23656));
	}
	
	static int naiveCount(int num) {
		int res = 0;
		while(num>0) {
			num=num/10;
			res++;
		}
		return res;
	}
	
	int efficientCount(int num) {
		return (int) (Math.log10(num) +1);
	}
}
