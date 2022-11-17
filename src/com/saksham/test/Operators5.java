package com.saksham.test;

import java.util.Scanner;

public class Operators5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the  first number :");
		 a = sc.nextInt();
		System.out.println("Enter the second number :");
		 b = sc.nextInt();
		 if (a==b) {
			 System.out.println("First number is equal to second number");
		 }
		 else {
			 System.out.println("First number is not equal to second number");
		 }
	}
}
