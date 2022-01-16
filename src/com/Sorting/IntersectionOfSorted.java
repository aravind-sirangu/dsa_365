package com.Sorting;

class IntersectionOfSorted {
	public static void main(String[] args) {
		int[] a1 = {10,10,20,20,30,40,50};
		int[] a2 = {5,10,10,25,50};
		intersection(a1, a2);
		
	}
	
	static void intersection(int[] a1, int[] a2) {
		int n1 = a1.length;
		int n2 = a2.length;
		int i=0;
		int j=0;
		while(i<n1 && j<n2) {
			if(i>0 && a1[i-1]==a1[i]) {
				i++; continue;
			}
			if(a1[i]>a2[j]) {
				j++;
			}
			else if(a1[i]<a2[j]) {
				i++;
			}
			else {
				System.out.println(a1[i]);
				i++;j++;
			}
		}
	}
	
}
