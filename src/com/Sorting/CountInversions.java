package com.Sorting;

class CountInversions {
	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5};
		System.out.print(countInversion(arr,0,4));
	}
	
	static int countInversion(int[] arr, int l, int r) {
		int res = 0;
		if(l<r) {
			int mid = l + (r-l)/2;
			res+= countInversion(arr, l, mid);
			res+= countInversion(arr, mid+1, r);
			res+= countAndMerge(arr, l, r, mid);
		}
		return res;
	}
	
	static int countAndMerge(int[] arr, int l, int r, int mid) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		for (int i = 0; i < n1; i++) {
			a1[i] = arr[l+i];
		}
		for (int j = 0; j < n2; j++) {
			a2[j] = arr[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		int res =0;
		while (i<n1 && j< n2) {
			if(a1[i]>a2[j]) {
				arr[k++] = a2[j++];
				res = res+(n1-i);
			}
			else {
				arr[k++] = a1[i++];
				

			}
		}
		while(i<n1) {
			arr[k++] = a1[i++];
		}
		while(j<n2) {
			arr[k++] = a2[j++];
		}
		return res;
	}
	
}
