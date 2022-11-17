package com.saksham.test;

import java.util.Scanner;

public class StringManupulation2 {

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	String sen = sc.next();
	int a = sen.length();
	System.out.println("Enter the second string");
	String sen1 = sc.next();
	int b= sen1.length();
	
	if (a>b) {
		System.out.println("first string length is "+ a+ " more compared to the " + b +" second string length");
	}
	else
	{
System.out.println("first string length is " + a +" less than the " + b +" second string length");
}	
}
}