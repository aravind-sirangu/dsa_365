package com.Arrays;

class LeftRotate {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] res = leftRotate(arr, 4);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	static int[] leftRotate(int[] arr, int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
		return arr;
		
	}
	
	static int[] reverse(int[] arr,int high, int low) {
		while(high<low) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			high++;
			low--;
			
		}
		return arr;
	}
	
}
