package jump2java;

	class Animal4 {
	    String name;

	    void setName(String name) {
	        this.name = name;
	    }
	}

	class Dog4 extends Animal4 {
	    void sleep() {
	        System.out.println(this.name + " zzz");
	    }
	}

	class HouseDog2 extends Dog4 {
	    void sleep() {
	        System.out.println(this.name + " zzz in house");
	    }

	    void sleep(int hour) {
	        System.out.println(this.name + " zzz in house for " + hour + " hours");
	    }
	}

	public class jun07 {
	    public static void main(String[] args) {
	        HouseDog2 houseDog = new HouseDog2();
	        houseDog.setName("happy");
	        houseDog.sleep();  // happy zzz in house 출력
	        houseDog.sleep(3);  // happy zzz in house for 3 hours 출력
	    }
	}