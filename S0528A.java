package jump2java;

abstract class Animal {
	void sleep() {
		System.out.println("잠");
	}
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println("멍멍");
	}
}

public class S0528A {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.sleep();
	}
}