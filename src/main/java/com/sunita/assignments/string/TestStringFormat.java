package com.sunita.assignments.string;

//Demo java program for String Format method
//The java string format() method returns a formatted string using the given locale, specified format string and arguments.
//We can concatenate the strings using this method and at the same time, we can format the output concatenated string.

//locale– locale value to be applied on the format() method
//format– format of the output string
//args– It specifies the number of arguments for the format string.It may be zero or more.

public class TestStringFormat {
	
	public static String strTest = "using Java tutorials ";
	public static String strName ="";
	public static double doubleNumber = 3456.45;
	public static int intNumber = 10;
	
	
	public static void stringFormat(){
		strName = String.format(" Explore language %s ", strTest);
		System.out.println(strName);
	}

	public static void stringFormatforDouble(){
		
		System.out.println("Print 25 space before number " + String.format("%25.8f", doubleNumber));
		
		//print upto 4 decimal places 
		System.out.println("Print number upto 4 decimal places " + String.format("%.4f", doubleNumber));
		
		
	
	}
	
	public static void stringFormatforInteger(){
	
		// left padding using  format() method  - output is 3 0s before number
		System.out.println(" Left padding for number " + intNumber + "  :  " + String.format("%05d",intNumber));
		
		//print hexadecimal value
		System.out.println("print hexadecimal value of number " + intNumber + " : " + String.format("%h", intNumber));
		
		System.out.println("Print 10 space before number : " + String.format("*%-10d*", intNumber));
	}
	
	public static void main(String[] args) {
		
		// Concatenation of two strings 
		stringFormat();
		
		// Output is given upto 8 decimal places 
		stringFormatforDouble();
		
		stringFormatforInteger();
		
		
		
	}

}
