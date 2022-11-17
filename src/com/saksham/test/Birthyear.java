package com.saksham.test;
import java.util.Calendar;  
import java.util.GregorianCalendar;
import java.util.Scanner;  

public class Birthyear {

	public static void main(String args[])   
	{  
	 int age ; 
		String name;
		    Scanner sc = new Scanner(System.in);  
		    System.out.print("Enter the name : ");  
		    name = sc.next() ;
		    System.out.print("Enter the age: ");  
		    age = sc.nextInt() ;
	    Calendar currentDate = new GregorianCalendar();  
	    int date = currentDate.get(Calendar.YEAR) - age ;	  
	System.out.println("Your date of birth is: "+date);  
	}  
	}  
	


