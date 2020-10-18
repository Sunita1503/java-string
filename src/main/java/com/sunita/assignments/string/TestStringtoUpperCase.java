package com.sunita.assignments.string;

//Demo java program to convert string to upper case

public class TestStringtoUpperCase {

	
	public static void convertStringToUppercase(String strName){
		
		System.out.println("String converted to Uppercase : " + strName.toUpperCase());
		
	}
	
	public static void main(String[] args) {
		
		convertStringToUppercase("readingDiary");
		convertStringToUppercase("subject line");
		convertStringToUppercase("ABCD");

	}

}
