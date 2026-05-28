package jump2java;
import java.util.Scanner;

abstract class Book {
	String title;
	String author;
	int price;
	boolean borrowCheck;
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.borrowCheck = false;
	}
	
	void info() {
		System.out.println("==== 책 정보 ====");
		System.out.println("책 제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price + "원");
		
		if(borrowCheck == true) {
			System.out.println("대출중");
		} else {
			System.out.println("대출 가능");
		}
	}	
	abstract void borrow();
}

class Novel extends Book {
	String genre;
	Novel(String title, String author, int price, String genre) {
		super(title, author, price);
		this.genre = genre;
	}
	void bookinfo() {
		System.out.println("장르: "+ genre); {
		}
	}
		
	void borrow( ) {
		if(borrowCheck) {
			System.out.println("이미 대출 중");
		} else {
			System.out.println(title+"은 대출되었습니다.");
			borrowCheck = true;
		}
	}
}



public class T0528C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목: ");
		String title = sc.nextLine();
		System.out.println("저자: ");
		String author = sc.next();
		System.out.println("가격: ");
		int price = sc.nextInt();
		sc.close();
		Novel boo = new Novel(title, author, price, "소설");
		boo.info();
		boo.bookinfo();
		boo.borrow();
		boo.borrow();
	}
}