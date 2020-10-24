package com.sunita.assignments.string;

//Demo Java program for endsWith method
//The java string endsWith() method checks if this string ends with given suffix. 
//It returns true if this string ends with given suffix else returns false.

public class TestStringEndsWith {

public static void stringEndsWith(String strTest , String strSuffix){
		
		System.out.println(strTest.endsWith(strSuffix));
		
	}
	
	public static void main(String[] args) {
		
		stringEndsWith("Welcome","e");
		stringEndsWith("abcd", "s");
	}

}
