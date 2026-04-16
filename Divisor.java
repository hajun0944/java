package jump2java;
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		System.out.println(num+"의 약수");
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
				count++;
				sum += i;
		}
	}
	System.out.print("약수의 갯수:"+count);
	System.out.print("약수의 총합:"+sum);
	sc.close();
	}
}
