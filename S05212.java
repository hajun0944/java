package jump2java;
import java.util.Scanner;

class Animals{
	String name;
	int age;
	
	Animals(String name){
		this.name = name;
	}
		
	Animals(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void changeName(String name) {
		this.name = name;
		System.out.println("바뀐 이름: " +this.name);
	}
}

class Dog extends Animals{
	Dog(String name, int age) {
		super(name, age);
	}
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animals{
	Cat(String name, int age) {
		super(name, age);
	}
	void sound() {
		System.out.println("야옹");
	}
}

public class S05212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("나이:");
		int age = sc.nextInt();
		sc.close();
		
		Dog dog = new Dog(name, age);
		Cat cat = new Cat("야옹", 2);
		
		dog.sound();
		cat.sound();
		cat.changeName("고양이");
	}
}




