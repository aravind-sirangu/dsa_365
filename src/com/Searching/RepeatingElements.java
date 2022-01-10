package com.Searching;

class RepeatingElements {
	public static void main(String[] args) {
		int[] arr = {2,3,5,7,1,1,4,6,1};
		int[] a1 = {2,3,5,7,0,0,1,6,0};
		System.out.println(withOutZero(arr));
		System.out.println(withZero(a1));
	}
	
	
	static int withOutZero(int[] arr) {
		int slow=arr[0];
		int fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow!=fast);
		
		slow=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast = arr[fast];
		}
		return slow;
	}
	
	
	static int withZero(int[] arr) {
		int slow = arr[0]+1;
		int fast = arr[0]+1;
		
		do {
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		}while(slow!=fast);
		
		slow = arr[0]+1;
		while(slow!=fast) {
			slow = arr[slow]+1;
			fast = arr[fast] +1;
		}
		return slow-1 ;
	}
	
}
