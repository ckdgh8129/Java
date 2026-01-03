package day20260102;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
	
		 //if 주차장에 요금이 기본요금 1000원이다
		 // 기본 시간은 30분이다.
		 //10분당 100원씩 추가 예 39분은 1000원, 40분은 1100원
		 // 단 4시간 이상주차시 기본요금은 2500원이다.
		 //예 ) 3시간 40분 (230분) - 3000원
		 //		4시간 12분 (252분) - 2600원
		 //분을 적으면 요금이 얼마인지 나오게 하라
		
		 int charge = 1000;
		 int add;
		 int fourhcharge = 2500;
		 	
		
		System.out.print("이용시간(분) : ");
		Scanner kbd = new Scanner(System.in);
		int time =kbd.nextInt();
		
		for(add=100; add <= 100; add++ )
		
		if(time >= 1 && time < 40) {
			System.out.println("이용요금 : "+charge);
		}else if (time >= 40 && time < 50 ) {
			System.out.println("이용요금 : "+add+charge);
		}else if (time >= 50 && time < 60 ) {
			System.out.println("이용요금 : "+(add+charge+100));
		}else if (time >= 60 && time < 70 ) {
			System.out.println("이용요금 : "+(add+charge+200));
		}else if (time >= 70 && time < 80 ) {
			System.out.println("이용요금 : "+(add+charge+300));			
		}else if (time >= 80 && time < 90 ) {
			System.out.println("이용요금 : "+(add+charge+400));
		}else if (time >= 90 && time < 100 ) {
			System.out.println("이용요금 : "+(add+charge+400));
		}else if (time >= 100 && time < 110 ) {
			System.out.println("이용요금 : "+(add+charge+400));
	
			
		}
//		}else {
//			System.out.println("이용요금 :"+fourhcharge);
			
		}
	 
	 
		
		 
	 
	}


