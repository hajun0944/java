package jump2java;
import java.util.Scanner;

public class TriangleLB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이:");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=1; j<=num-i; j++) {	
				System.out.print("*");
			}
			System.out.println();		
		}
	}
}
