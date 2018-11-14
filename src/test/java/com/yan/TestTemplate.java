package com.yan;

import java.util.ArrayList;
import java.util.List;

public class TestTemplate {
	public static void main(String[] args) {
//		JdbcTemplate jdbc = new JdbcTemplate();
//		
//		jdbc.update("", new Object[] {});

//		String row1 = "12小时43分钟55秒";
//		int[] a = {12, 43, 55}
//		int[] a = new int[3];
//		String hh = row1.substring(0, row1.indexOf("小时"));
//		a[0] = Integer.valueOf(hh);
//		System.out.println(a[0]);

		List<String> list = new ArrayList<String>();
		list.add("12小时43分钟55秒");
		list.add("13小时24分钟40秒");

		for (int i = 0; i < list.size(); i++) {
			String gap = list.get(i);
			int[] a = new int[3];
			String hh = gap.substring(0, gap.indexOf("小时"));
			a[0] = Integer.valueOf(hh);
			System.out.println(a[0]);

			String mm = gap.substring(gap.indexOf("小时") + 2, gap.indexOf("分钟"));
			a[1] = Integer.valueOf(mm);
			System.out.println(a[1]);

			String ss = gap.substring(gap.indexOf("分钟") + 2, gap.indexOf("秒"));
			a[2] = Integer.valueOf(ss);
			System.out.println(a[2]);
		}

	}
}
