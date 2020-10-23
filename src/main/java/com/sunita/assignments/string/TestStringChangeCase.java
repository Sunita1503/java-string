package com.sunita.assignments.string;

//Demo java program to change case

public class TestStringChangeCase {

	// convert string to upper case
	public static void convertStringToUppercase(String strName) {

		System.out.println("String converted to Uppercase : " + strName.toUpperCase());
	}

	// convert string to lower case
	public static void convertStringToLowercase(String strName) {

		System.out.println("String converted to Uppercase : " + strName.toLowerCase());
	}

	public static void main(String[] args) {

		convertStringToUppercase("readingDiary");
		convertStringToUppercase("subject line");
		convertStringToUppercase("ABCD");
		
		convertStringToLowercase("Welcome India");
		convertStringToLowercase("SUNITA");
		convertStringToLowercase("edalaBad ki KAHANI");

	}

}
