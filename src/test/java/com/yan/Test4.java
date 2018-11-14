package com.yan;

public class Test4 {

	public static void putToStart2(int[] aa) {

		for (int i = aa.length - 1, j = aa.length - 1; j >= 0; --j)

			if (aa[j] == 0) {// 交换i、j的对应值,并且i自增
				for(int k = j + 1; k <=i ; k++) {
					swap(aa, k, k-1);
				}

				i--;

			}

		for (int c : aa)

			System.out.print(c + " ");

	}
	
	public static void swap(int[] aa, int i, int j) {
		int tmp = aa[i];

		aa[i] = aa[j];

		aa[j] = tmp;
	}

	public static void main(String[] args) {
		int[] aa = { 1,0, 1, 2,0 };

		putToStart2(aa);
	}

}
