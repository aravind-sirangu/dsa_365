package com.Arrays;

class DuplicatesZeroes {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,5,6,7,7,7,7,8};
		int [] zeroArr = {1,2,0,0,3,4,5,0,0,6,0,7,0,0,8};
		int[] res = zeroesToEnd(zeroArr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	static int[] duplicatesRemove(int[] arr) {
		int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				arr[index] = arr[i];
				index++;
			}
		}
		return arr;
	}
	
	static int[] zeroesToEnd(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				
				index++;
			}
		}
		return arr;
	}
	
}
