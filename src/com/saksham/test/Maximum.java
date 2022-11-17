package com.saksham.test;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) { 
		 Scanner scan=new Scanner(System.in); 	    
			System.out.print("Enter the first number: ");
			int num=scan.nextInt();	
			System.out.print("Enter the second number: ");
			int num1=scan.nextInt();
			if (num!=num1)
			{
				switch (num >num1 ?0:1)
				{case 0:
				System.out.println(num +" is greater than the " +num1 );
				break ;
				case 1:
					System.out.println(num +" is not greater than the " +num1 );
				break;}
				}
	}
}

