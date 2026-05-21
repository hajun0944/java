package jump2java;
import java.util.Scanner;

class Animal {
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}	
}

public class S05211 {
	public static void main(String[] args) {
		Animal dog1 = new Animal();
		System.out.println(dog1.name);
		System.out.println(dog1.age);
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		dog1.setName(name);
		dog1.setAge(age);
		System.out.println(dog1.name);
		System.out.println(dog1.age);	
	}
}
