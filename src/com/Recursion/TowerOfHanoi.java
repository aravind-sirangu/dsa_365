package com.Recursion;

class TowerOfHanoi {
	public static void main(String[] args) {
		towerofHanoi(5, 'A', 'B', 'C');	
	}
	
	
	static void towerofHanoi( int n,char a, char b, char c) {
		
		if(n==1) {
			System.out.println("Move 1 from " + a+ " to " + c );
			return;
		}
		
		towerofHanoi(n-1, a, c, b);
		System.out.println("Move " + n + " from " + a + " to " + c);
		towerofHanoi(n-1, b, a, c);
	}
}
