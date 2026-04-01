package jump2java;

public class jun06 {
    int sum(int a, int b) {  // a, b 는 매개변수
        return a+b;
    }

    public static void main(String[] args) {
        jun06 sample = new jun06();
        int c = sample.sum(3, 4);  // 3, 4는 인수

        System.out.println(c);
    }
}
