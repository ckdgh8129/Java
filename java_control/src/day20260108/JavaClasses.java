package day20260108;

public class JavaClasses {

	public static void main(String[] args) {
		User u = new User();			//참조 변수
		User u2 = new User();			//배열과는 다르다!!(크기가 다른애들의 모임)
		User u3 = u;
		//u. <-접근 연산자  		object 는 부모격 클래스 object 사용시 상속
			u.age = 30;
			System.out.println(u.age);
			System.out.println(u3.age);
			u.name = "이순신";
			u.job = "구닌";
			System.out.println(u.job+' '+u.name);
			
			// 책 이름 저자 출판년도를 저장할수 있는 클래스 정의
			// 객체 생성하여 데이터 넣고 출력
	}

}

class User{ //User 라는 클래스 정의
	
	 int age;
	 String name;
	 String job;
	 
}

/*
 	자바 클래스
 	
 	데이터 저장 방법 - 변수 , 배열 , 구조체, 클래스
 
 




*/