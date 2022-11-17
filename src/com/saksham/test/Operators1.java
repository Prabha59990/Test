package com.saksham.test;

import java.util.Scanner;

public class Operators1 {

	public static void main(String[] args) {
		
		int num1, num2 , max;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First number : ");	
		 num1 =sc.nextInt();
		System.out.println("Enter the Second number : ");	
		 num2 =sc.nextInt();
		 max=num1>num2 ? num1:num2;  
		    System.out.println("The Maximum number is: "+max);  
		    } 
	}

