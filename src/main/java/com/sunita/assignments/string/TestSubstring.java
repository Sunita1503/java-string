package com.sunita.assignments.string;

//Demo Java program for substring method
// StartIndex: inclusive
// endIndex: exclusive 

public class TestSubstring {

	public static String strName = "SunitaShinde";
	public static String strResult;
	
	public static void checkSubstring(){
		
		System.out.println("Substring from startIndex 2 : " +strName.substring(2));
		
		System.out.println(" Substring with startIndex and endIndex : " + strName.substring(0, 6));
	}
	
	public static void main(String[] args) {
		
		checkSubstring();
	}

}
