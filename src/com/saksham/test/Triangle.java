package com.saksham.test;

import java.util.Scanner;

public class Triangle {

	    public static void main(String args[])
	    { 	    
	    	int a, b, c, sum;
	    	  Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a first number: ");
		         a = sc.nextInt();	
		        System.out.print("Enter a second  number: ");
		        b = sc.nextInt();
		        System.out.print("Enter a three number: ");
		         c = sc.nextInt();
		        sum=a+b+c;
		        if (sum==180) {
		        	System.out.println("it will form the triangle");
		        }
		        else {
		        	System.out.println("it will notform the triangle");	
		        }
		        
	    }
	        }
	

