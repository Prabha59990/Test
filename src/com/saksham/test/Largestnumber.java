package com.saksham.test;
import java.util.Scanner;  

public class Largestnumber {
 
    public static void main(String[] args)   
    {  
    int a, b, c, largest, check;  
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the first number:");  
    a = sc.nextInt();  
    System.out.println("Enter the second number:");  
    b = sc.nextInt();  
    System.out.println("Enter the third number:");  
    c = sc.nextInt();  
    check=a>b?a:b;  
    largest=c>check?c:check;  
    System.out.println("The largest number is: "+largest);  
    }  
    }  	

