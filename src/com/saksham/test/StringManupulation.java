package com.saksham.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringManupulation {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter sentence : ");
	        String words = sc.nextLine();
	        words= words.replace(" ", ",");        
	        ArrayList<String> words1 = new ArrayList<String>();
	        words1.add(words);
	        System.out.println("Comma separated String: " + words1);       	   	    	   
	       }	
	  }

