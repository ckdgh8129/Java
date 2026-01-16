package mainpkg;

import able.Actionable;
import dto.Cafe;
import dto.Member;

public class MainMethod {

	public static void main(String[] args) {
		
//		Actionable member = new Member("Skyblue","이순신",34);
//		
//		member.move();
//		member.drink();
//		System.out.println( member.toString());
//		
		String[] menu = {"아메리카노","라떼","녹차","홍차","치즈케이크","티라미슈"};
		
		Cafe cafe = new Cafe("창호카페",menu);
		
		cafe.showMenu();
		System.out.println("===========\n\n");
		
		cafe.order("홍차");
		System.out.println("==========\n\n");
		cafe.order("치즈케이크");
		System.out.println("==========\n\n");
		cafe.order("사이다");
		System.out.println("========== \n\n");
	}
	

}
