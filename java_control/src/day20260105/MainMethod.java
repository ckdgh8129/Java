package day20260105;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

//		int num = (int)Math.floor(Math.random()*9)+7;
//		
//		System.out.println(num);
//	동전의 앞뒷면 맞추기
		Scanner kbd = new Scanner(System.in);

//		int coin = (int) Math.floor(Math.random() * 2) + 1;
//		// 1 -앞면 ,2 - 뒷면
//
//		System.out.println("동전 앞면 뒷면 맞추기");
//		System.out.print("1:앞면,2:뒷면 \n 입력 : ");
//		int user = kbd.nextInt();
//
//		if (user == coin) 
//			System.out.println("성공");
//			else
//				System.out.println("실패");

//		int  dice = (int) Math.floor(Math.random() * 6) + 1;
//		
//		System.out.println("주사위 맞추기");
//		System.out.print("1~6 중하나 \n 입력 :");
//		int num = kbd.nextInt();
//		
//		if (num==dice)
//			System.out.println("성공");
//		else 
//			System.out.println("실패");

//		// 컴퓨터 주사위
//		int com = (int) Math.floor(Math.random() * 6) + 1;
//		// 내 주사위
//		int user = (int) Math.floor(Math.random() * 6) + 1;
//
//		System.out.println("컴퓨터 주사위 : " + com);
//		System.out.println("내 주사위 : " + user);
//		// 내가 컴터보다 큰가 작은가 비겼나
//
//		if (user > com || (user == 1 && com == 6))
//			if (user == 6 && com == 1)
//				System.out.println("졌다..");
//			else
//				System.out.println("내가이김");
//		else if (user == com)
//			System.out.println("비김요...");
//		else
//			System.out.println("졌다..");
//	}

		// 컴퓨터와 함께 하는 가위바위보 게임!!
		// 1 -가위 2 - 바위 3 - 보자기

		// 컴퓨터와의 가위바위보는 랜덤으로
		// 나의 가위바위보 값은 키보드로 입력
		// 내가 이겼는지 , 졌는지 비겼는지 출력

		int com = (int) Math.floor(Math.random() * 3) + 1;

		System.out.println("가위바위보 게임");
		System.out.print("가위(1)바위(2)보(3) 입력 :");

		int user = kbd.nextInt();

		System.out.println("컴퓨터 : " + com);
		System.out.println("나 : " + user);

//		if (user == com)
//			System.out.println("비겼다");
//		else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2)
//			System.out.println("이겼다");
//		else
//			System.out.println("졌다");
		
		
		int res = user - com;
		if(res == 0)
			System.out.println("비김");
		else if(res==-2||res==1)
			System.out.println("이김");
		else 
			System.out.println("짐..");
		
		
	}
}
