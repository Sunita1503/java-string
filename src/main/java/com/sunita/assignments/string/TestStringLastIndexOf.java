package com.sunita.assignments.string;

//Java program to demonstrate String lastIndexOf method
//The java string lastIndexOf() method returns last index of the given character value or substring.
//If it is not found, it returns -1

public class TestStringLastIndexOf {

	public static String strTest = "This is Sugar town elementary school";
	public static int intIndex;
	

	// prints index of character
	public static void lastIndexOfCharacter(char charValue) {

		intIndex = strTest.lastIndexOf(charValue);
		System.out.println("Last Index of character \"" + charValue + "\" is : " + intIndex);
	}

	//prints index of character at given index number
	public static void lastIndexOfCharacter(char charValue ,int index) {

		intIndex = strTest.lastIndexOf(charValue, index);
		System.out.println("Last Index of character \"" + charValue + "\" is : " + intIndex);
	}

	// prints index of string
	public static void lastIndexOfString(String strName) {

		intIndex = strTest.lastIndexOf(strName);
		System.out.println("Last Index of string   \"" + strName + "\" is : " + intIndex);
	}

	// prints index of string at given index number
	public static void lastIndexOfString(String strName, int index) {

		intIndex = strTest.lastIndexOf(strName,index);
		System.out.println("Last Index of string   \"" + strName + "\" is : " + intIndex);

	}

	public static void main(String[] args) {
		
		//display original string 
		System.out.println("Original String is : " + strTest);
		System.out.println( " and length of string is : " + strTest.length() );
		
		//prints index of character i
		lastIndexOfCharacter('s');
		
		// prints index of character  t after index number 10
		lastIndexOfCharacter('s', 25);
		
		//prints index of substring own
		lastIndexOfString("is");
		
		//prints index of substring ment after index 15
		lastIndexOfString("ar",30);
	
	}	
}
