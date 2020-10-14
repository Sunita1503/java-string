package com.sunita.assignments.oops;

//demonstration of single inheritance in java
//super class vehicle
class vehicle {

	public void start() {
		System.out.println("Start vehicle");
	}

	public void stop() {
		System.out.println("Stop vehicle");
	}
}

// sub - class car
	class Car extends vehicle {
	
		public void noofSeats() {
			System.out.println("No of seats in car");
		}
		
		
	}
	
//sports car inherits from vehicles
	class SportsCar extends Car {
		
		public void openHood(){
			System.out.println("Open hood sports car");
		}
		
	}

public class MultilevelInheritance {

	public static void main(String[] args) {

		SportsCar objSportsCar = new SportsCar();
		objSportsCar.start();  // method from vehicle class
		objSportsCar.noofSeats(); // method from car class
		objSportsCar.openHood(); // method from SportsCar
	}

}
