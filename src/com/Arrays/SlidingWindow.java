package com.Arrays;

class SlidingWindow {
	public static void main(String[] args) {
		int[] arr = {1,4,20,3,10,5};
		subArraywithGivenSum(arr, 29);
	}
	
	
	static void subArraywithGivenSum(int[] arr, int x) {
		int sum = arr[0];
		int start=0;
		int end=0;
		boolean flag = false;
		for (int i = 1; i < arr.length; i++) {
			sum+=arr[i];
			end = i; 
			if(sum==x) {
				flag=true;
				break;
			}

			else {
				while(sum>x ) {
					sum-=arr[start];
					start++;
				}
				
				if(sum==x) {
					flag=true;
					break;
				}
			}
		}
		if(flag) {
			for(int j =start; j<=end; j++) {
				System.out.print(arr[j] + " ");
			}
		}
		else {
			System.out.println(flag + " " + sum);
		}
		
	}
	
}
