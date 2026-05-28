package jump2java;

abstract class Machine {
	abstract void start();
}

class Computer extends Machine {
	void start() {
		System.out.println("시작");
	}
}
public class T0528A {
	public static void main(String[] args) {
		Computer com = new Computer(); 
		com.start();
	}
}