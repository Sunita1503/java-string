package com.sunita.assignments.string;

//Demo java program for String Comparison Using == Operator
public class TestStringComparisonUsingequlaToOperator {

	public static String strName2 = "Welcome";
	public static String strName3 = new String("Welcome");
	
	
	public static void doVerifyStringUsingEqualsandObjectReference(String str1, String str2){
		//use of == operator which compares references
		if (str1 == str2)
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal ");
		else
			//This statement executes as 
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are not equal ");  
		
	}
	
	public static void main(String[] args) {
		
		doVerifyStringUsingEqualsandObjectReference(strName2,strName3);

	}

}
