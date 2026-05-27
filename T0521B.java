package jump2java;
import java.util.Scanner;

/*파일명:T0521B
클래스명:Car
생성자: 이름 입력받음
메소드: setColor(차량 색상 입력받음)
          setDistance(주행거리 입력받음)
          => void 또는 return값이 있는 경우로 만듦.
메인함수에서 car 객체 생성
=> 색, 주행거리 입력하고 화면에 출력*/

class Car{
    String name;
    String color;
    int distance;

    Car(String name){
        this.name = name;
    }

    Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int setDistance(int distance) {
        this.distance = distance;
        return this.distance;
    }
}

public class T0521B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("색상: ");
        String color = sc.next();

        System.out.print("주행거리: ");
        int dis = sc.nextInt();

        sc.close();

        Car car1 = new Car("씽씽이", "red");

        Car car2 = new Car(name);

        // 입력값 저장
        car2.setColor(color);
        car2.setDistance(dis);

        System.out.println(car1.name + " 색: " + car1.color);
        System.out.println(car1.name + " 주행거리: " + car1.distance);

        System.out.println(car2.name + " 색: " + car2.color);
        System.out.println(car2.name + " 주행거리: " + car2.distance);
    }
}
