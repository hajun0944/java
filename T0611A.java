package jump2java;
import java.util.Scanner;
import java.util.ArrayList;

class Car {
	String name;
	int year;
	
	Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	void info() {
		System.out.println("이름: "+ name);
		System.out.println("연식: "+ year);
	}
	
	void drive() {
		System.out.println(name + "달린다.");
	}
	
	int getAge() {
		return 2026-year;
	}
}
class ElectricCar extends Car {
	double battery;
	ElectricCar(String name, int year, double battery) {
		super(name, year);
		this.battery = battery;
	}
	void info() {
		super.info();
		System.out.println("배터리: "+ battery);
	}
	void drive() {
		System.out.println(name+" 전기로 달린다.");
	}
}

class SportsCar extends Car {
	int maxspeed;
	
	SportsCar(String name, int year, int maxspeed) {
		super(name, year);
		this.maxspeed = maxspeed;
	}
	void info() {
		System.out.println("최고 속도: "+ maxspeed);
	}
	void drive() {
		System.out.println(name+" 고속으로 달린다.");
	}
}

public class T0611A {
	public static void main(String[] args) {
		/*
		Car car1 = new Car("카", 2015);
		car1.info();
		car1.drive();
		System.out.println("구입한 지 "+ car1.getAge() +"년");
		System.out.println("================");
		ElectricCar car2 = new ElectricCar("전기", 2025, 55.6);
		car2.info();
		car2.drive();
		car2.getAge();
		System.out.println("================");
		SportsCar car3 = new SportsCar("날쌘돌이", 2021, 260);
		car3.info();
		car3.drive();
		*/
		Scanner sc = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		
		while (true) {
			System.out.println("\n=== 차량 등록 시스템 ===");
			System.out.println("1. 전기차 등록");
			System.out.println("2. 스포츠카 등록");
			System.out.println("3. 자동차 조회");
			System.out.println("4. 종료");
			System.out.print("번호 선택: ");
			int menu = sc.nextInt();
			switch(menu) {
			
			case 1:
				System.out.println("이름, 연식, 배터리 입력하시오.");
				String eName = sc.next();
				int eYear = sc.nextInt();
				double ebattery = sc.nextDouble();				
				cars.add(new ElectricCar(eName, eYear, ebattery));
				break;
				
			case 2:
				System.out.println("이름, 연식, 최고속도를 입력하시오.");
				String sName = sc.next();
				int sYear = sc.nextInt();
				int speed = sc.nextInt();				
				cars.add(new SportsCar(sName, sYear, speed));
				break;
				
			case 3:
				if(cars.isEmpty()) {
					System.out.println("등록된 차 없음.");
				} else {
					for(Car a: cars) {
						a.info();
						a.drive();
						System.out.println("나이: " + a.getAge()+"년");
						System.out.println("=====================");
					}	
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력");
			}	
		}
	}
}