package day20260105;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// github.com/masterJKR/hallabong_java 교수님 깃허브 주소
		// 1월 5일과제
		// 가위 바위 보 게임을 총 15회 진행
		// 게임을 진행 하면서 1판 끝날때 마다
		// 몇승, 몇패, 몇무 출력하기

		Scanner kbd = new Scanner(System.in);
//		System.out.println("가위(1) 바위(2) 보(3) 게임 시작");
//		int count = 0;
//		int count2 = 0;
//		int count3 = 0;
//		for (int i = 1; i <= 15; i++) {
//			int com = (int) Math.floor(Math.random() * 3) + 1;
//			System.out.print("나 : ");
//			int user = kbd.nextInt();
//			System.out.println("컴퓨터 : " + com + "\n---------");
//			int res = user - com;
//			if (res == 0) {
//				count++;
//				System.out.println("이번판 무승부" + count);
//			} else if (res == -2 || res == 1) {
//				count2++;
//				System.out.println("이번판 승리" + count2);
//			} else {
//				count3++;
//				System.out.println("이번판 패배" + count3);
//			}
//			System.out.println("무승부 :" + count + "   승리 :" + count2 + "   패배 :" + count3 + "\n-----------------");
//		}

		int winCount = 0, loseCount = 0, drawCount=0;
		
		for (int i = 1; i <= 15; i++) {
			int com = (int) Math.floor(Math.random() * 3) + 1;

			System.out.println("가위바위보 게임");
			System.out.print("가위(1)바위(2)보(3) 입력 :");

			int user = kbd.nextInt();

			System.out.println("컴퓨터 : " + com);
			System.out.println("나 : " + user);
			int res = user - com;
			if(res == 0) {
				System.out.println("비김");
				drawCount++;
			}
			else if(res==-2||res==1) {
				System.out.println("이김");
				winCount++;
			}
			else 
				System.out.println("짐..");
				loseCount++;
		}
			System.out.println(" 승 : "+winCount+" 패 : "+loseCount+" 무 "+drawCount);
	}

}
