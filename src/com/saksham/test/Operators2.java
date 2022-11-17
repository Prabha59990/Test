package com.saksham.test;

import java.util.Scanner;

public class Operators2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 :");
		String sen = sc.next();
		System.out.println("Enter the string 2 :");
		String sen1 = sc.next();
int a =sen.length();
int b= sen1.length();

if (a >b || a<b) {
	System.out.println(" String length is comapared");
}		
else {
	System.out.println(" String length is not comapared");

}
	}
}
