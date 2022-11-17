package com.saksham.test;

import java.util.Scanner;

public class Operator4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, modulus;
		System.out.println("Enter the  first number :");
		 a = sc.nextInt();
		System.out.println("Enter the second number :");
		 b = sc.nextInt();
		 modulus=a%b;
System.out.println("Result: " +modulus);
	}
}
