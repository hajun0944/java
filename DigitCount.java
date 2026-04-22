package jump2java;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int user;
		System.out.println("양수를 입력하세요.");
		user = sc.nextInt();
		
		while(user > 0) {
			user = user / 10;
			count++;
		}
		System.out.printf("%d자리 수 입니다.", count);
		sc.close();
	}

}
