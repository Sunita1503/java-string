package com.sunita.assignments.string;

//Java Program to demonstrate String comparison using equals , equalIgnoreCase
public class TestStringComparisonUsingEquals {

	public static String strName  = "Sunita";
	public static String strName1 = "Sunita";
	public static String strName2 = "SUNITA";
	public static String strName3 = new String("Sunita");
	
	
	//method to check if strings are equal using equals method which compares actual values
	public static void doVerifyStringUsingEquals(String str1, String str2){
		if (str1.equals(str2))
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal ");
		else
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are not equal ");
	}
	
	//using object reference
	public static void doVerifyStringUsingEqualsandObjectReference(String str1,String str2){
		
		if(str1.equals(str2))
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal ");
		else
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are not equal ");
			
	}
	
	public static void doVerifyStringUsingEqualsIgnoreCase(String str1, String str2){
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal ");
		else
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are not equal ");
			
	}

	
	public static void main(String[] args) {
		
		System.out.println("String comparison using equals : ");
		doVerifyStringUsingEquals(strName,strName1);
		System.out.println("String comparison using equals and object reference : ");
		doVerifyStringUsingEqualsandObjectReference(strName1, strName3);
		System.out.println("String comparison using equal Ignore case : ");
		doVerifyStringUsingEqualsIgnoreCase(strName1, strName2);

	}

}
