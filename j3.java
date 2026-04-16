package jump2java;
import java.util.Scanner;

public class j3 {
	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int num = sc.nextInt();
		
		System.out.print(num+"의 약수");
		
		for(int i=1; i<=num; i++ ) {
			if(num%i ==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
