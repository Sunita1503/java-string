package com.sunita.assignments.string;

//Java program to demonstrate String IndexOf
//The java string indexOf() method returns index of given character value or substring. If it is not found, it returns -1

public class TestStringIndexOf {

	public static String strTest = "This is Sugar town elementary school";
	public static int intIndex;
	

	// prints index of character
	public static void indexOfCharacter(char charValue) {

		intIndex = strTest.indexOf(charValue);
		System.out.println("Index of character \"" + charValue + "\" is : " + intIndex);
	}

	//prints index of character at given index number
	public static void indexOfCharacter(char charValue ,int index) {

		intIndex = strTest.indexOf(charValue,index);
		System.out.println("Index of character \"" + charValue + "\" is : " + intIndex);
	}

	// prints index of string
	public static void indexOfString(String strName) {

		intIndex = strTest.indexOf(strName);
		System.out.println("Index of string   \"" + strName + "\" is : " + intIndex);
	}

	// prints index of string at given index number
	public static void indexOfString(String strName, int index) {

		intIndex = strTest.indexOf(strName,index);
		System.out.println("Index of string   \"" + strName + "\" is : " + intIndex);

	}

	public static void main(String[] args) {
		
		//display original string 
		System.out.println("Original String is        : " + strTest);
		
		//prints index of character i
		indexOfCharacter('s');
		
		// prints index of character o t after index number 10
		indexOfCharacter('t', 15);
		
		//prints index of substring own
		indexOfString("is");
		
		//prints index of substring ment after index 15
		indexOfString("ar",15);

	}

}
