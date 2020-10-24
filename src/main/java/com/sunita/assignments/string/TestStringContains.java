package com.sunita.assignments.string;

//Demo Java program for String method contains
//The java string contains() method searches the sequence of characters in this string. 
//It returns true if sequence of char values are found in this string otherwise returns false

public class TestStringContains {

	public static boolean isContains;
	public static String strName = "ID and address proof necessary for Aadhar card ";
	
	
	public static boolean doVerifyStringContains(String strTest){
		
		isContains = strName.contains(strTest);
		System.out.println(strName + " contains " + strTest + " : " + isContains);
		return isContains;
	}
	
	public static void main(String[] args) {
		
		doVerifyStringContains("address");  //string found
		doVerifyStringContains("java");     //string not found
		doVerifyStringContains("aadhar");   //change in case
		

	}

}


