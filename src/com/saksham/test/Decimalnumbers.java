package com.saksham.test;
import java.util.Scanner;

public class Decimalnumbers {

	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the first decimal number: ");
	        float num1 = scan.nextFloat();
	        System.out.print("Enter the second decimal number: ");
	        float num2 = scan.nextFloat();
	        System.out.print("Enter the third decimal number: ");
	        float num3 = scan.nextFloat();
	        scan.close();
	        System.out.print("The average of entered decimal numbers is:" + avr(num1, num2, num3) );
	    }

	  public static float avr(float a, float b, float c)
	    {
	        return (a + b + c) / 3;
	    }
	}
	
