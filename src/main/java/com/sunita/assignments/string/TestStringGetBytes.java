package com.sunita.assignments.string;

// Java program to demonstrate String getBytes method

//getbytes() function in java is used to convert a string into sequence of bytes and returns an array of bytes


public class TestStringGetBytes {
	
	public static String strTest ="ABSEEDI";

	public static void stringGetByte(){
		
		// Displaying converted string before conversion
		System.out.println("String Before conversion is : " + strTest);
		
		// converting the string into byte using getBytes ( converts into ASCII values )
       	byte[] byteArray = strTest.getBytes();
       	
     // Displaying converted string after conversion
       	System.out.println("String Before conversion is : " );
       	for (int i=0;  i<byteArray.length; i++){
       		System.out.print(byteArray[i] + " ");
       	}
       	
       	//Print original string 
       	System.out.println();
       	String strName = new String(byteArray);
       	System.out.println("Byte to  String : " + strName);
       	
		
	}
	
	public static void main(String[] args) {
	
		stringGetByte();
	}

}
