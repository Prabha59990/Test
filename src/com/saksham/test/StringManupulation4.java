package com.saksham.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringManupulation4 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter");
		String word = sc.next();
		String wordcheck= "Developer";
		Boolean found = Arrays.asList(word.split(" ")).contains(wordcheck);
		if(found){
			System.out.println("Developer word is matched");
		}
		else {
			System.out.println("Developer word is not matched");
		}
	}
}
