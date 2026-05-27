package jump2java;

import java.util.Scanner;

class Animal {
    String name;
    double weight;
    String color;

    Animal(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void sound() {
        System.out.println(this.name + "가 운다.");
    }
}

class Capibara extends Animal {

    Capibara(String name) {
        super(name);
    }

    void sound() {
        System.out.println("법법");
    }
}

public class S0527A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        Animal capibara1 = new Animal(name);
        Capibara capibara2 = new Capibara("카피바라");

        capibara1.setColor("갈색");

        System.out.println(capibara1.name + " " + capibara1.color);
        capibara1.sound();
        
        capibara2.setColor("white");
        System.out.println(capibara2.name + " " + capibara2.color);
        capibara2.sound();
        
        sc.close();
    }
}