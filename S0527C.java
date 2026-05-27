package jump2java;

interface Animals {
    void sound();
}

class Dogs implements Animals {
    public void sound() {
        System.out.println("멍멍!!");
    }
}

class Cats implements Animals {
    public void sound() {
        System.out.println("야옹~");
    }
}

public class S0527C {
    public static void main(String[] args) {

        Animals[] animals = new Animals[2];

        animals[0] = new Dogs();
        animals[1] = new Cats();

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }
    }
}