package jump2java;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    void sleepTogether() {
        super.sleep();  // 부모 클래스 Dog의 sleep 메서드 호출
        System.out.println("and " + this.name + " zzz in house");
    }
}

public class jun1 {
	public static void main(String[] args) {
		 HouseDog houseDog = new HouseDog();
	        houseDog.setName("happy");
	        houseDog.sleep();
	        houseDog.sleep(3);
	}
}
