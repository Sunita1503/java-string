package com.sunita.assignments.string;

public class StringJava {

	String s1 = "java"; // creating string by java string literal
	char ch[] = { 'l', 'i', 't', 'e', 'r', 'a', 'l' };
	String s2 = new String(ch); // converting char array to string
	String s3 = new String("TEST"); // creating java string by new keyword
	String s4 = "java";
	String s5 = "Television";

	public void concatString(String param1, String param2) {

		System.out.println("String combined using concat : " + param1.concat(param2));

		String result = param1 + param2;
		System.out.println("String combined using + operator : " + result);
	}

	public void compareString() {
		// compare two strings using equals
		System.out.println("String comparison using equals  : " + s1.equals(s3));

		// compare Strings using CompareTo
		System.out.println("String comparison using compareTo : " + s1.compareTo(s4));

		System.out.println("Compare Strings using equalsIgnoreCase : " + s1.equalsIgnoreCase("Java"));

	}

	public void substring() {

		System.out.println("Substring of String  " + s5 + " : " + s5.substring(0, 4));
	}

	public void changeCase() {

		System.out.println("USe of toUpperCase  : " + s1.toUpperCase());

		System.out.println("USe of toLowerCase  : " + s3.toLowerCase());
	}

	public static void main(String[] args) {

		StringJava objStringJava = new StringJava();
		objStringJava.concatString("Next", "Generation"); // concat strings

		objStringJava.compareString();

		objStringJava.substring();

		objStringJava.changeCase();

	}

}
