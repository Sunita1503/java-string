package com.sunita.assignments.string;

//Demo java program for intern method

public class TestStringIntern {

	public static String strName = "JavaMethod";
	
	public static void stringIntern(String strTest){
		String strTest1 = new String(strTest);
		String strResult = strTest1.intern();
		System.out.println(strResult == strName);
	}
	
	public static void main(String[] args) {
		
		stringIntern("");
		stringIntern("Sunita");
		stringIntern("JavaMethod");
		

	}

}
