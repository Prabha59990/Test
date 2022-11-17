package com.saksham.test;

import java.util.ArrayList;

public class Arrays5 {

	public static void main(String[] args) {
		String result ="Easycloud, Saksham";
        ArrayList<String> result1 = new ArrayList<String>();
		result1.add(result);

		String resu ="Software Solutions";
     ArrayList<String> result2 = new  ArrayList<String>(result1);
		result2.add(resu);
    System.out.println(result2);
	}
}
