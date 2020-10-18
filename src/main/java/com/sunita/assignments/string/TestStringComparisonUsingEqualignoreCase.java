package com.sunita.assignments.string;

//demo java program for String Comparison Using Equal ignore Case

public class TestStringComparisonUsingEqualignoreCase {
	
	public static String strName1 = "Circle";
	public static String strName2 = "CIRCLE";
	
	
	

public static void doVerifyStringUsingEqualsIgnoreCase(String str1, String str2){
		
	////ompares  String to another string by ignoring case
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal ");
		else
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are not equal ");
			
	}

	
	public static void main(String[] args) {
		
		
		doVerifyStringUsingEqualsIgnoreCase(strName1, strName2);

	}

}
