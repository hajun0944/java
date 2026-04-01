package jump2java;

class Calculator4

{
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }

    static int sub(int num) {
        result -= num;
        return result;
    }
}

public class jun04 {
	public static void main(String[] arg) {
		System.out.println(Calculator4.add(3));
        System.out.println(Calculator4.sub(4));
	}
}
