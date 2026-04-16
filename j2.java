package jump2java;
import java.util.Random;

public class j2 {
	public static void main(String[] arges) {
		Random rand = new Random();
		int n1 = rand.nextInt(9);	//한자리 양의 정수(0~8)
		int n2 = -1 - rand.nextInt(9);	//한자리 음의 정수(-1~-9)
		int n3 = 10 + rand.nextInt(90);	//10~99
	
		double x1 = rand.nextDouble(); //0.0이상 1.0미만
		double x2 = rand.nextDouble()*10;	//0.0이상 10.0미만
		double x3 = rand.nextDouble()*2-1;	//-1.0이상 1.0미만
		
		System.out.printf("%f %f %f", x1, x2, x3);
	}
}
