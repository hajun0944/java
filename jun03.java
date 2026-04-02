package jump2java;

	class Animal {
	    String name;

	    void setName(String name) {
	        this.name = name;
	    }
	}

	class Dog extends Animal {  // Animal 클래스를 상속한다.
	}

	public class jun03 {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.setName("poppy");
	        System.out.println(dog.name);
	    }
	}

