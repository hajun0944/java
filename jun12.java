package jump2java;
import java.util.ArrayList;

public class jun12 {
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");		
		numbers.add("three");	
		
		for (String number : numbers) {
			System.out.println(number);
		}
	}
}
