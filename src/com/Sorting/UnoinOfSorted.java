package com.Sorting;

class UnionOfSorted {
	public static void main(String[] args) {
		int[] a1 = {10,10,20,20,30,40,50};
		int[] a2 = {5,10,10,25,50};
		union(a1, a2);
	}
	
	static void union(int[] a1, int[] a2) {
		int n1 = a1.length;
		int n2 = a2.length;
		int i=0;
		int j=0;
		while(i<n1 && j<n1) {
			if( i>0 && (a1[i] == a1[i-1])) {
				i++;
				continue;
			}
			if( j>0 && (a2[j] == a2[j-1])) {
				j++;
				continue;
			}
			
			if(a1[i] < a2[j]) {
				System.out.print(a1[i] + " ");
				i++;
			}
			else if (a1[i] > a2[j]) {
				System.out.print(a2[j]+ " ");
				j++;
			}
			else {
				System.out.print(a1[i]+ " ");
				i++;j++;
			}
		}
	}
	
}
