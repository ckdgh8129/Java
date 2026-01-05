package day20260102;

import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		
//		int time;
//		int base = 1000;
//		int min;
//		int addbase = 2500;
//		Scanner kbd = new Scanner(System.in);
//		
//		System.out.print("주차시간(분): ");
//		time = kbd.nextInt();
//
//		if(time >= 240 ) {
//			for(min=250; time >= min; min+=10 ) {
//			addbase+= 100;	
//			}
//			System.out.println("금액: "+addbase+"원");
//		}
//		else if(time >= 30) {
//			for(min=40; time >= min; min+=10 ) {
//				base+= 100;
//		}
//			System.out.println("금액: "+base+"원");
//		}
//		else {
//			System.out.println("금액: "+base+"원");
//	}
	
		int cost = 1000; //기본요금
		int inc = 100, incTime= 10;//10분당 100원
		int time = 30; //기본시간 30분
		
		//주차 시간 중 몇분 입력
		Scanner scan = new Scanner(System.in);//시스템 으로 부터 입력된 키 값 받기
		
		System.out.println("총 몇분 주차 :");
		int pTime = scan.nextInt();//키보드 입력 값 받아서 정수로 변환하여 변수에 저장
		
		pTime/=10; //pTime = pTime/10 -3
	
		if( pTime >= 24 ) { //4시간 이상 주차 했다면 pTime >= 240
			cost = 2500; //4시간 이상에 대한 기본요금 변경
			pTime -=24; //4시간 빼기, 4시간에 대한 요금은 2500원 나머지는 10분당 요금
		}else if( pTime > 3 ) { //4시간 이상이 아니라면. 기본시간 30분으로 계산하여야한다.
			pTime -= 3; //기본요금이 30분이니까 3빼기
		}else { //최초 기본시간 안에서 주차 한 경우
			pTime=0;
		}
		// 주차요금 계산
		int price = cost + pTime*100;
		System.out.println("주차요금 : "+price+"원");
	
	}
	
}
