package com.sunita.assignments.oops.inheritance;

//Java program to demonstrate Hierarchical Inheritance wherein

// Multiple classes inherits properties from a single class
// Animals -> Dog & Animals -> Cats

class Animals {

	public void sound() {
		System.out.println("Animal method - Sound : Generic ");
	}

	public void eats() {
		System.out.println("Animal method - Eats");
	}
}

// Child class
class Dogs extends Animals {

	public void sound() {
		System.out.println("Dog method - sound : Bark");
	}
}

// Child class
class Cats extends Animals {
	public void sound() {
		System.out.println("Cat method - sound : Meow");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		// create object of Cats class
		Cats objCats = new Cats();

		// create object of Dog class
		Dogs objDogs = new Dogs();

		objCats.eats(); // Object objCats calls the method eats from Animal
						// class

		objDogs.sound(); // Object objDog calls the method from its own class

	}

}
