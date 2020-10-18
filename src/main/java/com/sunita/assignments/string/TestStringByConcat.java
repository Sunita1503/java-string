package com.sunita.assignments.string;

//Demo Java Program to concat Strings 

public class TestStringByConcat {

	public static String strName1 = "Science";
	public static String strName2 = "Fiction";
	
	public static String strResult = "";
	
	//String Concatenation by + (string concatenation) operator
	public static void stringConcatUsingPlusOperator(){
		
		strResult = strName1 + strName2;
		System.out.println("Combined String using + operator :" + strResult);
	}
	
	public static void stringConcatUsingPlusOperatorAndInt(){
		strResult = 25 + 15 + strName1 + 55 + 30 + strName2; 
		System.out.println("25 + 15 " + strName1 + " 55 + 30  " + strName2 + " after concat is : " + strResult);
	}
	
	//String Concatenation by concat() method
	public static void stringConcat(){
		
		strResult = strName1.concat(strName2);
		System.out.println("Combined string using concat method is : " + strResult);
		
	}
	
	public static void main(String[] args) {
		
		//use of + operator for String concat
		stringConcatUsingPlusOperator();
		
		//After a string literal, all the + will be treated as string concatenation operator.
		stringConcatUsingPlusOperatorAndInt();
		
		stringConcat();
		
	}

}
