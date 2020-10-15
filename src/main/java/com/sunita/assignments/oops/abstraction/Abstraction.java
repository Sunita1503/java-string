package com.sunita.assignments.oops.abstraction;


//Java program to demonstrate Abstract class and interfaces

interface Rules{
	
	void loanRules();
	void securtiyRules();
}

abstract class Bank implements Rules{
	
	abstract int getRateofInterest();
	
	//implements method of interface
		public void securtiyRules() {
		
			System.out.println("Bank Security rules");
		}
}

class SBI extends Bank{
	
	//constructor
	SBI(){
		System.out.println("SBI Bank");
	}
	
	//implement abstract method
	int getRateofInterest(){
		return 6;
	}
	
	
	//implements method of interface
	public void loanRules() {
	
		
	}
	
}

class IOB extends Bank{
	
	//constructor
	IOB(){
		System.out.println("IOB Bank");
	}
	
	//implement abstract method
	int getRateofInterest(){
		return 8;
	}
	//implements method of interface
	public void loanRules(){
		System.out.println("IOB loan Rules");
	}

	//implements method of interface
	public void securtiyRules() {
		
		System.out.println("IOB security Rules");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		Bank objBank;
		
		objBank = new SBI();
		objBank.getRateofInterest();
		System.out.println("Rate of Interest is " + objBank.getRateofInterest() + "%");
		objBank.securtiyRules();
		
		objBank = new IOB();
		objBank.getRateofInterest();
		System.out.println("Rate of Interest is " + objBank.getRateofInterest() + "%");
		objBank.loanRules(); 
		objBank.securtiyRules();
		

	}

}
