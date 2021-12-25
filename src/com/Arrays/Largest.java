package com.Arrays;

class Largest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(largest(arr));
		System.out.println(secondLargest(arr));
	}
	
	static int largest(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(temp<arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}
	
	static int secondLargest(int[] arr) {
		int temp = arr[0]>arr[1] ? arr[0] :arr[1];
		int res = arr[0]<arr[1] ? arr[0] :arr[1];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>temp) {
				res=temp;
				temp=arr[i];
			}
			else {
				if(arr[i]>res) {
					res=arr[i];
				}
			}
		}
		return res;
	}
	
}
