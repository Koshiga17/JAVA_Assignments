package com.cts;
class Vehicle {
	String name;
	int speed;
	
	public Vehicle(String name,int speed) {
		this.name=name;
		this.speed=speed;
	}
	public String displayInfo() {
		return name+"travels at a speed of "+speed+" km/h.";
	}
}
class Truck extends Vehicle {
	int cargoCapacity;
	public Truck(String name,int speed,int cargoCapacity) {
		super(name,speed);
		this.cargoCapacity=cargoCapacity;
	}
	@Override
	public String displayInfo() {
		return "Truck "+name+" travels at "+speed+" km/h and has a cargo capacity of "+cargoCapacity+" tons.";
		
	}
}
class Bus extends Vehicle {
	int passengerCapacity;
	public Bus(String name,int speed,int passengerCapacity) {
		super(name,speed);
		this.passengerCapacity=passengerCapacity;
	}
	@Override
	public String displayInfo() {
		return "Bus "+name+" travels at "+speed+" km/h and can carry "+passengerCapacity+" passengers.";
		
				}
}
class Car extends Vehicle {
	String fuelType;
	public Car(String name,int speed,String fuelType) {
		super(name,speed);
		this.fuelType=fuelType;
	}
	@Override
	public String displayInfo() {
		return "Car "+name+" travels at "+speed+" km/h and uses "+fuelType+" fuel.";
	}
}

public class Main {

	public static void main(String[] args) {
		Truck truck=new Truck("Volvo",80,15);
		Bus bus=new Bus("Mercedes",60,50);
		Car car=new Car("Tesla",120,"Electric");
		System.out.println(truck.displayInfo());
		System.out.println(bus.displayInfo());
		System.out.println(car.displayInfo());
		

	}

}
