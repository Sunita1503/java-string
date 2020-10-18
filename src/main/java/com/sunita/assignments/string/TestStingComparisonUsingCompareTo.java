package com.sunita.assignments.string;

//Demo java program for Sting Comparison Using CompareTo
//The java string compareTo() method compares the given string with current string lexicographically. 
//It returns positive number, negative number or 0

public class TestStingComparisonUsingCompareTo {
	
	public static String strName1  = "Varad";
	public static String strName2 = "Varad";
	public static String strName3 = "Sunita";
	public static String strName4 = "Poonam";

	
	
	//method to check if strings are equal using equals method which compares actual values
	public static void doVerifyStringUsingCompareTo(String str1, String str2){
		int strVCompareValue = str1.compareTo(str2);
		if (strVCompareValue == 0)
			System.out.println("Strings " + str1 + " and  "+ str2 + "  are equal  by " + strVCompareValue);
		else if (strVCompareValue > 0)
			System.out.println("String : " + str1 + " grater than String :  "+ str2  + " by " + strVCompareValue );
		else
			System.out.println("String : " + str1 + " is less String : "+ str2 + " by "  + strVCompareValue);
		
		//System.out.println(str1.compareTo(str2));
	}
	
	
	public static void main(String[] args) {
		
		doVerifyStringUsingCompareTo(strName1, strName2);
		doVerifyStringUsingCompareTo(strName2, strName3);
		doVerifyStringUsingCompareTo(strName3, strName1);
		doVerifyStringUsingCompareTo(strName1, strName4);
		
	}

}
