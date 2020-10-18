package com.sunita.assignments.string;

//Demo Java program for endsWith method
public class TestStringEndsWith {

public static void stringEndsWith(String strTest , String strSuffix){
		
		System.out.println(strTest.endsWith(strSuffix));
		
	}
	
	public static void main(String[] args) {
		
		stringEndsWith("Welcome","e");
		stringEndsWith("abcd", "s");
	}

}
