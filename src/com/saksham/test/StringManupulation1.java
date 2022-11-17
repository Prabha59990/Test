package com.saksham.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringManupulation1{

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter sentence : ");
	        String sentence = sc.next();
	        sentence = sentence.replaceAll("[0-9]", "");
	        ArrayList<String> result1 = new ArrayList<String>();
           result1.add(sentence);
		    System.out.println(result1);	                
	       }	     	  
}     	
