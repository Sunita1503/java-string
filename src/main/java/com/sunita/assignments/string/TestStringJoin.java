package com.sunita.assignments.string;

//Java program to demonstrate String join method
//The java string join() method returns a string joined with given delimiter. 
//In string join method, delimiter is copied for each elements.
//In case of null element, "null" is added

public class TestStringJoin {
	
	public static  String strTest;

	public static void stringJoin(CharSequence charSquencDelimiter, CharSequence charSequenceElement ){
		strTest = String.join(charSquencDelimiter, charSequenceElement);
		System.out.println("New string " + strTest);
	}
	
	public static void main(String[] args) {
		
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);	
		

        String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10"); 
        System.out.println(" "+time);  
		
		//stringJoin("/" ,"welcome to java");
	}

}
