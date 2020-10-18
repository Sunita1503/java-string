package com.sunita.assignments.string;

//Demo java program for String Trim method

public class TestStringTrim {
	
	
	//The string trim() method eliminates white spaces before and after string
	public static void stringTrim(String strName){
		 System.out.println("Original String :" + strName);
		System.out.println("New String :" + strName.trim() );
	}
	
	
	public static void main(String[] args) { 
		
		System.out.println("String Trim Demo");
		stringTrim("     Welcome **    ");
		stringTrim("  Sunita Shinde ");
	}

}
