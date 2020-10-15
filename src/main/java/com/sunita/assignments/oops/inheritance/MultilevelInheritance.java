package com.sunita.assignments.oops.inheritance;

//Java program to demonstrate Multi Level Inheritance
//A class inherits properties from a class which again  inherits properties from its parent class

// Animal-> Dog-> Bull Dog

//Animal is a super class
class Animal {

	// Generic method for all animals
	public void sound() {

		System.out.println("Animal method - sound");
	}

	public void eats() {
		System.out.println("Animal method - eats");
	}

}

class Dog extends Animal {

	// sound method for Dog class
	public void sound() {
		System.out.println("Dog method - Sound");
	}
}

class BullDog extends Dog {
	/*
	 * public void sound(){ System.out.println("BullDog method - Sound"); }
	 */
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		// create object of BullDog class
		BullDog objBullDog = new BullDog();
		objBullDog.eats(); // calls method from Animal - parent of Dog class
		objBullDog.sound(); // calls method from immediate parent

	}

}
