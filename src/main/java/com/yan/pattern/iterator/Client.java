package com.yan.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		Iterator<Integer> i;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(3);
		
		i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
