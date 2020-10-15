package com.sunita.assignments.oops.inheritance;

//Java program to demonstrate Single inheritance
//child class inherits parent class
// Vehicle -> Cars

class Vehicle {

	public void speedLimit() {
		System.out.println("Vehicle method - Speed limit");
	}
}

class Cars extends Vehicle {

	public void fuelType() {
		System.out.println("Cars method - Fuel Type");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		// create object of class Cars
		Cars objCars = new Cars();
		objCars.speedLimit(); // calling method from parent class

	}

}
