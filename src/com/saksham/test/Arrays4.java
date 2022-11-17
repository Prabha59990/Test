package com.saksham.test;

import java.util.ArrayList;
import java.util.List;

public class Arrays4 {

	public static void main(String[] args) {		
		List<String> alist = new ArrayList<String>();
		alist.add("0");
		alist.add("1");
		alist.add("2");
		alist.add("3");
		String value = alist.get(3);
		System.out.println(value);
	}
}
