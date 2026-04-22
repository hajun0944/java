package jump2java;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(90) + 10;
		int user = 0;
		int count = 0;
		
		System.out.println("2자리 숫자 맞추기 게임을 시작합니다.");
		
		while(true) {
			System.out.println("2자리 자연수를 입력하세요.");
			user = sc.nextInt();
			count++;
			if (user < 10 || user > 99) {
				System.out.println("2자리 정수를 다시 입력하세요.");
			} else if(user > answer) {
				System.out.println("더 작은 수");
			} else if(user < answer) {
				System.out.println("더 큰 수");
			} else {
				System.out.println("정답입니다.");
				System.out.printf("시도 횟수 : %d번",count);
				break;
			}
		}
		sc.close();
	}

}
