package com.saksham.test;

import java.util.Collections;
import java.util.Scanner;

public class Stringmanupulation3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");	
		String word = sc.next();
		String result = String.join(" ", Collections.nCopies(15, "welcome ") +word );
        System.out.println(result);
	}
}
