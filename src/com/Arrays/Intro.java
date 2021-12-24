package com.Arrays;

import java.util.ArrayList;

class Intro {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,0,0};
		int[] res = insertatIndex(arr, 6, 4, 3, 9);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		arrayList(5);
	}
	
	static int[] insertatIndex(int[] arr,int n, int cap, int x, int y) {
		if(n<=cap) {
			System.out.println("already Full");
			return arr;
		}
		
		for(int i=cap;i>=x;i--) {
			arr[i+1] = arr[i];
		}
		arr[x] = y;
		return arr;
	}
	
	static void arrayList(int n) {
		ArrayList<Integer> aL = new ArrayList<Integer>();
		for(int i=1; i<=n;i++) {
			aL.add(i);
		}
		System.out.println(aL);
	}

}
