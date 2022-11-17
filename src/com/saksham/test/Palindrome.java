package com.saksham.test;

import java.util.Scanner;

public class Palindrome {

	    public static void main(String args[])
	    {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     int n = sc.nextInt();
	     int sum = 0, r;
		 int check = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(check==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");    
	     }  
	}  
         
	
