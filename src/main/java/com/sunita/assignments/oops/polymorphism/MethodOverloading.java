package com.sunita.assignments.oops.polymorphism;


//Java program to demonstrate method overloading
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
//There are two ways to overload the method in java
// 1.By changing number of arguments 2. By changing the data type
public class MethodOverloading {

	//add two interger numbers
	public static void addNumbers (int param1, int param2) {  
	
		int intResult = param1 + param2;
		System.out.println("Addition of " + param1 + " and " + param2 + " is : " + intResult);
	}
	
	//add three interger numbers
	public static void addNumbers (int param1, int param2,int param3) {  
		
		int intResult = param1 + param2 + param3;
		System.out.println("Addition of " + param1 + " and " + param2 +  " and " + param3 + " is : " + intResult);
	}
	
	//add two float numbers
	public static void addNumbers (float param1, float param2) {  
		
		float floatResult = param1 + param2;
		System.out.println("Addition of " + param1 + " and " + param2 + " is : " + floatResult);
	}
	
	//add three float numbers
	public static void addNumbers (float param1, float param2,float param3) {  
		
		float floatResult = param1 + param2 + param3;
		System.out.println("Addition of " + param1 + " and " + param2 +  " and " + param3 + " is : " + floatResult);
	}
	
	public static void main(String[] args) {
		
		//add two interger numbers
		addNumbers(12, 13);
		//add three interger numbers
		addNumbers(14, 20, 10);
		//add two float numbers
		addNumbers(12.34f, 10.45f);
		//add three float numbers
		addNumbers(31.4f, 56.23f, 67.8f);
		
	}
}
