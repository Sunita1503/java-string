package com.sunita.assignments.string;

//Demo Java program for charAt()
//The string charAt() method returns a character at specified index

public class TestStringCharAt {
	
	public static String strTest = "online school";
	
	public static void checkStringCharAt(int intIndex){
		System.out.println("String Character at index " + intIndex  + " is : " + strTest.charAt(intIndex));
	}

	public static void main(String[] args) {

		System.out.println("Original String : " + strTest);
		 checkStringCharAt(3);
		 checkStringCharAt(5);
		 checkStringCharAt(10);
	}

}
