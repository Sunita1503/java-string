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
		
		doVerifyStringUsingEquals(strName,strName1);
		doVerifyStringUsingEqualsandObjectReference(strName1, strName3);
		doVerifyStringUsingEqualsIgnoreCase(strName1, strName2);

	}

}
