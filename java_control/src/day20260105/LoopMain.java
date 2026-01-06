package day20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}

//		for(int i=1; i<=100; i++) {
//			if(i %40 == 0)
//				System.out.println(i);
//		}
		Scanner kbd = new Scanner(System.in);

//		System.out.println("정수 입력 :");
//		int num= kbd.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			System.out.println(i);
//		}

		// 1부터 12까지 출력하는데
		// 4의 배수에는 four 라고 출력하시오

//		for (int i = 1; i <= 12; i++) {
//			if (i %4 == 0)
//				System.out.println("※four");
//			else
//				System.out.println(i);
//		}
//		int count = 0;
//		for (int i=1; i<=1000; i++) {
//			if(i %17==0) {
//				count++;
//		 }
//		}
//		System.out.println("17의배수는"+count+"개");

		// 문제
		// 동전 앞면 뒷면 맞추기 게임
		// 게임을 총 10번 진행
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기

//		int count = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			int coin = (int) Math.floor(Math.random() * 2) + 1;
//		
//			System.out.print("\n선택:");
//			int user=kbd.nextInt();
//			
//			if (user == coin) {
//				count++;
//			}
//
//			System.out.println("동전:" + coin);
//		}
//		System.out.println("맞춘횟수 :"+count+"번");
		
		
		//-----------------------------------------------------
		// 무한 루프 - 반복문은 조건식이 참인경우에 계속 반복 수행을 한다.
		//			무조건 참이 되게 조건식을 설정하면 무한 반복을 할수 있다.
		//무한 루프는 지정된 회수가 없기에 멈추지 않고 계속 동작한다.
		// 그래서 무한 루프 구현시 특정 조건을 걸어 둔다.
		
//		for(;true;) {
//			
//		}
//		for(;;) {
//			;
//		}
		//-----------
		//초기값
//		while(true) {
//			System.out.println("97돌실패");//증가 값
//		}
//		int i = 10;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if (i >=40 ) break;
//		}
	
//		while(true) {
//			int num = (int)Math.floor(Math.random()*20)+1;
//			System.out.println(num);
//			if (num == 11) break;
//		}
		//컴퓨터가 내가낸 문제를 찾을수있게 한번 해보기
//	int com=(int)Math.floor(Math.random()*50)+1;
//		
//		while(true) {
//			System.out.print("1~50중 입력 : ");
//			int user = kbd.nextInt();
//			
//			if(user > com ) {
//				System.out.println("\nDown");
//			}
//			if(user < com) {
//				System.out.println("\nUp");
//			}
//			if(user == com) {
//				System.out.println("정답");
//			break;}
//			
		
		int max =50, min=1;
		System.out.print("1~50중 입력 : ");
		int user = kbd.nextInt();
		while(true) {

			
			int com=(int)Math.floor(Math.random()*max)+min;
			if(user < com ) {
							
				System.out.println(com);
				System.out.println("Down\n----------");
			max=com;
			
				
			}
			else if(user > com) {
							
				System.out.println(com);
				System.out.println("Up\n------------");
			com=min;
				
			}
			else if(user == com) {
				
				
				System.out.println(com);
				System.out.println("정답");
			break;}
			
		}
	}
}

/*
 * 반복문 - for, while, do-while 반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정이다. 또는 횟수의 제한없이 동작
 * 시킬수 있따.
 * 
 * for문 for(초기값; 조건식; 증강식){ 반복 실행할 내용; 반복 실행 할 내용; } for(int =1; i<=5; i++){
 * 
 * }
 * 
 * 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 그래야 몇번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠르고
 * 
 * 자주쓰게될 for (Member m : MemberList){
 * 
 * }
 *
 *
 */