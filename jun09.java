package jump2java;

public class jun09 {

    int a;  // 객체변수 a

    void varTest(jun09 sample) {
        sample.a++;
    }

    public static void main(String[] args) {
        jun09 sample = new jun09();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}
