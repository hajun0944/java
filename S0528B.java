package jump2java;

abstract class Vehicle {
	void start() {
		System.out.println("시작");
	}
	abstract void run();
}

class Car extends Vehicle {
	void run() {
		System.out.println("자동차 달린다");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("오토바이를 달린다");
	}
}

public class S0528B {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new Bike();
		
		for(int i = 0; i < vehicles.length; i++) {
			vehicles[i].run();
		}
	}
}