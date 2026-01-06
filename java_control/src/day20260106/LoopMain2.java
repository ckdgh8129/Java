package day20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		int max=50,min=1;
//		
//		System.out.print("1~50중 입력 : ");
//		
//		int user = kbd.nextInt();
//		
//		while(true) {
//			int com=(int)Math.floor(Math.random()*(max-min+1))+min;
//			
//			if(user < com ) {
//				System.out.println(com);
//				System.out.println("Down\n------------");
//				max=com-1;
//				
//				
//			}
//			if(user > com) {
//				System.out.println(com);
//				System.out.println("Up\n-----------");
//				min=com+1;
//				
//				
//			}
//			if(user == com) {
//				System.out.println(com);
//				System.out.println("정답");
//			break;}
//	}
		
		//숫자야구
		
		System.out.println("=====숫자야구=====");
		int a =(int) Math.floor(Math.random()*9)+1, b=0, c=0;
//		
//		while(true) {
//			 b = (int) Math.floor(Math.random()*9)+1;
//			 c = (int) Math.floor(Math.random()*9)+1;
////			System.out.println("a"+a+"b"+b+"c"+c);
//		if(a != b && a != c && b!= c) break;
//		
		do {
			 b = (int) Math.floor(Math.random()*9)+1;
			 c = (int) Math.floor(Math.random()*9)+1;
		}while(!(a != b && a != c && b!= c));
		}
	
//		while(true) {
//			int str=0,ball=0;
//			System.out.println("1~9 중에 숫자 세개 입력 : ");
//			int user1=kbd.nextInt();
//			int user2=kbd.nextInt();
//			int user3=kbd.nextInt();
//			if(a==user1) 
//				str++;
//			if(b==user2)
//				str++;
//			if(c==user3) 
//				str++;
//			if(a==user2 || a==user3)
//				ball++;
//			if(b==user3 || b==user1)
//				ball++;
//			if(c==user1 || c==user2)
//				ball++;
//				System.out.println("스트라이크"+str+" 볼"+ball+" 아웃"+(3-str-ball));
//				if(str==3) {
//					System.out.println("정답!!");
//					break;
//				}
//		}
		
		}

//}

