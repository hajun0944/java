package jump2java;

class Book {
	String title;
	String author;
	int price;
	boolean borrowCheck;
	
	Book (String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		borrowCheck = false; 
	}
	
	void Info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		
		if (borrowCheck) {
			System.out.println("대출 중");
		} else {
			System.out.println("대출 가능");          
		}
	}
	
	void borrow() {
		if (borrowCheck) {
			System.out.println(title + "은(는) 이미 대출중입니다.");
		} else {
			borrowCheck = !borrowCheck;
			System.out.println(title + "대출 완료");
		}
	}
}
	
	class Novel extends Book {
		String genre;
		
		Novel(String title, String author, int price, String genre) {
			super(title, author, price);
			this.genre = genre;
			borrowCheck = false;
		}
	}
	
public class Library {
	
	public static void main(String[] args) {
		Book[] book = new Book[2];
		book[0] = new Novel("해리포터", "롤링", 20000, "판타지");
		
		book[0].Info();
		book[0].borrow();
		book[0].borrow();
	}

}
