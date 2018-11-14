package com.yan.algorithm.devide;

public class binarySearchNotRecursive {
	public static int search(int[] a, int x) {
		int pre = 0;
		int last = a.length -1;
		while (pre <= last) {
			int mid = (pre + last) / 2;
			if (x == a[mid]) {
				return mid;
			} else if (x < a[mid]) {
				last = mid - 1;
			} else {
				pre = mid + 1;
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 11, 20, 33, 35, 67};
		int result = search(a, 67);
		
		System.out.println(result);
	}
}
