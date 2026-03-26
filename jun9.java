package jump2java;

public class jun9 {
	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
		    a++;
		    if (a % 2 != 0) {
		        continue;  // 홀수인 경우 조건문으로 돌아간다.
		    }
		    System.out.println(a);  // 짝수만 출력된다.
		}

	}
}
