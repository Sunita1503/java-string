package com.sunita.assignments.oops;

//demonstration of single inheritance in java

//super class vehicle
class vehicle1 {

	public void start() {
		System.out.println("Start vehicle");
	}

	public void stop() {
		System.out.println("Stop vehicle");
	}
}

// sub - class car
class car1 extends vehicle1 {

	public void noofSeats() {
		System.out.println("No. of seats in car ");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
	car1 objCar = new car1();
	objCar.start(); //method from vehicle class (super class)
	objCar.stop(); // method from vehicle class

	}

}
