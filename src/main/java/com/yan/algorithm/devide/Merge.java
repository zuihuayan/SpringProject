package com.yan.algorithm.devide;

public class Merge {
	
	/**
	 * 合并算法，调用的前提条件是：
	 * 1.下标low -> mid 有序
	 * 2.下标 mid + 1 -> high 有序
	 */
	public static void mergeSort(int[] a, int low, int mid, int high) {
		int i = low, j = mid + 1;// 俩个子数组的活动游标
		int[] b = new int[high - low + 1];// 辅助数组
		int k = 0;// 辅助数组下标

		while (i <= mid && j <= high) {// 将小的元素放入辅助数组
			if (a[i] <= a[j]) {
				b[k++] = a[i++];
			}
			if (a[i] > a[j]) {
				b[k++] = a[j++];
			}
		}

		while (i <= mid) {//将左边数组中剩余的 i->mid 中的数据放入辅助数组
			b[k++] = a[i++];
		}
		while (j <= high) {//将右边数组中剩余的 j->high 中的数据放入辅助数组
			b[k++] = a[j++];
		}
		
		for(int m = 0; m < b.length; m++) {
			a[low + m] = b[m];
		}
	}
	
	//拆分，调用合并算法
	public static void merge(int[] a, int low, int high) {
		if(low == high) {//一个元素是有序的，不需要排序
			return ;
		}
		int mid = (low + high) / 2;
		merge(a, low, mid);
		merge(a, mid + 1, high);
		mergeSort(a, low, mid, high);
	}
	
	public static void main(String[] args) {
		int[] a = {5, 2, 50, 1, 29, 45, 35};
		merge(a, 0, a.length - 1);
		
		for(int t : a) {
			System.out.println(t);
			
		}
	}

}
