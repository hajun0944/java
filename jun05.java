package jump2java;

public class jun05 {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 42;

        jun05 sample = new jun05();
        int c = sample.sum(a, b);

        System.out.println(c);
    }
}
