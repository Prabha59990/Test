package com.saksham.test;

import java.util.Scanner;

public class Marks {

	 public static void main(String args[])  
	    {  
	    int a, b,c,d, sum;  
	    Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the 1.Telugu marks: ");  
	    a = sc.nextInt();  
	    System.out.print("Enter the 2.English marks: ");  
	    b = sc.nextInt();  
	    System.out.print("Enter the 3.Maths marks: ");  
	    c = sc.nextInt();  
	    System.out.print("Enter the 4.sceince marks: ");  
	    d = sc.nextInt();  
	    sum = sum(a, b , c, d );  
	    System.out.println("The sum of three numbers a, b, c and d is: " + sum);  
	    }  
	    public static  int sum(int a, int b, int c ,int d)  
	    {  
	    int sum = a + b + c + d;  
	     return sum;  
	    }  
}
