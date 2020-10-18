package com.sunita.assignments.string;

//Demo Java program for valueOf 
//The string valueOf() method coverts given type such as int, long, float, double, boolean, char into string.

public class TestStringValueOf {

	public static String strTest = "";

	// Test interger value
	public static String testStringValueOfInt(int intNo) {

		strTest = String.valueOf(intNo);
		return strTest;
	}

	// test long value
	
	public static String testStringValueOfLong(long longNo) {

		strTest = String.valueOf(longNo);
		return strTest;
	}

	
	// Test float value
	public static String testStringValueOfFloat(float floatNo) {

		strTest = String.valueOf(floatNo);
		return strTest;
	}
	
	// Test double value
		public static String testStringValueOfDouble(double doubleNo) {

			strTest = String.valueOf(doubleNo);
			return strTest;
		}

	// Test boolean value
	public static String testStringValueOfBoolean(boolean flag) {

		strTest = String.valueOf(flag);
		return strTest;
	}

	// test char value	
		public static String testStringValueOfChar(char charCh) {

			strTest = String.valueOf(charCh);
			return strTest;
		}
		
	public static void main(String[] args) {

		// Test integer value
		System.out.println("Test integer value : " + testStringValueOfInt(12) + 14);
		
		// Test long value
		System.out.println("Test Long value : " + testStringValueOfLong(-767673413412l) + 14);

		// test float value
		System.out.println("test float value : " + testStringValueOfFloat(23.4546f) + 34);

		// test double value
		System.out.println("test double value : " + testStringValueOfDouble(34354545423.442454324) );
		
		// test boolean value
		System.out.println("test boolean value : " + testStringValueOfBoolean(false) + true);
		
		// test char value
		System.out.println("test char value : " + testStringValueOfChar('a') + "C");
		

	}

}
