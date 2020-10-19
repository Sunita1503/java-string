package com.sunita.assignments.string;

//Demo java program for String replace
public class TestStringReplace {

	public static String strTest = " xpath - absolute xpath , relative xpath";
	public static String replaceString = "";
	
	//replace sequence of characters
	public static String stringReplaceCharacters(String target , String replacement ){
		replaceString =  strTest.replace(target,replacement);
	//	System.out.println("**** "+replaceString);
		return replaceString;
	}
	
	//replace character
	public static String stringReplaceChar(Character oldChar, Character newChar){
	
		replaceString = strTest.replace(oldChar, newChar);
		return replaceString;
	}
	
	//replaceAll
	public static String stringReplaceAll(String regex,String replacement){
		replaceString = strTest.replaceAll(regex, replacement);
		return replaceString;
	}
	
	//remove white spaces
	public static String stringReplaceAllWhiteSpaces (){
		replaceString = strTest.replaceAll("\\s", "");
		return replaceString;
	}
	
	public static void main(String[] args) {
		
		System.out.println("String before replacement : " + strTest);
		System.out.println("===========================================");
		String strResult = stringReplaceCharacters("xpath", "xml-path");
		System.out.println("String after replacement :  " + strResult);
				
		strResult = stringReplaceChar('x', 'h');
		System.out.println("New String after replacing char n for * : " + strResult);
				
		strResult = stringReplaceAll("path", "locator");
		System.out.println("New string ater replaceAll : " +strResult );
		
		strResult = stringReplaceAllWhiteSpaces();
		System.out.println("String without white spaces : " +strResult);
	}

}
