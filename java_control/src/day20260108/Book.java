package day20260108;

public class Book {

	public static void main(String[] args) {
		
		Books b = new Books();
		
		b.bookName="신데렐라";
		b.author = "샤를페로";
		b.year= 1990;
		System.out.println(b.bookName+" "+b.author+" "+b.year);

	}

}
//// 책 이름 저자 출판년도를 저장할수 있는 클래스 정의
// 객체 생성하여 데이터 넣고 출력


class Books{
	
	String bookName;
	String author;
	int year;
	
}