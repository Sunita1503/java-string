package com.sunita.assignments.string;

// Demo Java program for startsWith method

public class TestStringStartsWith {

	
	
	public static void stringStartsWith(String strTest , String strPrefix){
		
		System.out.println(strTest.startsWith(strPrefix));
		
	}
	
	public static void main(String[] args) {
	
		stringStartsWith("Question", "q");
		stringStartsWith("question", "q");

	}

}
