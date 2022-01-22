package com.Sorting;

class KthSmallest {
	public static void main(String[] args) {
		int [] arr = {6,7,8,3,1,4,2,9,4};
		System.out.println(kthsmall(arr, 1, 0, 8));
	}
	
	
	static int kthsmall(int[] arr, int k, int l, int h) {
		while(l<=h) {
			int p = lumuto(arr, l, h);
			if(p==k-1) {
				return p;
			}
			else if (p>k-1) {
				h = p-1;
			}
			else {
				l = p+1;
			}
		}
		return -1;
	}
	
	static int lumuto(int[] arr, int l, int h) {
		int p = arr[h];
		int i = l-1;
		for (int j = l; j < h; j++) {
			if(arr[j]<p) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}

}
