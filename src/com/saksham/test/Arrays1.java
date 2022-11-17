package com.saksham.test;

import java.util.ArrayList;
import java.util.List;

public class Arrays1 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 list.add("Orange");
		 for(String fruit:list)  
		  System.out.println(fruit);  
	}
}
