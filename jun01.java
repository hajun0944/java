package jump2java;

class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class jun01 {
	public static void main(String[] arg) {

		        System.out.println(Calculator.add(3));
		        System.out.println(Calculator.add(4));
		    }

	}
