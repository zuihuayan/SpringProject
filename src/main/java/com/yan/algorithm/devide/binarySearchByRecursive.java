package com.yan.algorithm.devide;

public class binarySearchByRecursive {
	public static int search(int[] a, int pre, int last, int x) {
		if(pre > last) {
			return -1;
		}
		
		int mid = (pre + last) / 2;
		
		if(x < a[mid]) {
			return search(a, pre, mid - 1, x);
		} else if(x == a[mid]) {
			return mid;
		} else {
			return search(a, mid + 1, last, x);
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 11, 20, 33, 35, 67};
		int result = search(a, 0, 7, 33);
		
		System.out.println(result);
	}
	
}
