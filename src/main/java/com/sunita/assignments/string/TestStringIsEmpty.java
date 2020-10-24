package com.sunita.assignments.string;

//Java profram to demonstrate String isEmpty
//The java string isEmpty() method checks if this string is empty or not. 
//It returns true if string is empty otherwise it returns false.

public class TestStringIsEmpty {

	public static void doVerifyStringIsEmpty(String strTest){
		
		//check Either length is zero or isEmpty is true
		if (strTest.isEmpty() || strTest.length() ==0)
			System.out.println("String : " + strTest + " is empty");
		else
			System.out.println("String : " + strTest + " is not empty");
	}
	
	public static void main(String[] args) {
		
		//verify for string 
		doVerifyStringIsEmpty("Welcome to java");
		
		//verify for empty string
		doVerifyStringIsEmpty("");

	}

}
