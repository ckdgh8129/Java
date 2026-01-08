package day20260107;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Test0107 {

	public static void main(String[] args) {
		//

//		Scanner kbd = new Scanner(System.in);
//
//		int[] seats = new int[50];
//		for (int i = 0; i < seats.length; i++) {
//			seats[i] = (int) Math.floor(Math.random() * 2);
//			for (int k = 0; k < i; k++) {
//
//				break;
//			}
//		}
//
//		while (true) {
//			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
//			for (int i = 0; i < 10; i++) {
//				for (int k = 0; k < 5; k++) {
//					if (seats[i * 5 + k] == 0) {
//						System.out.printf("│ %3c ", '1');
//					} else
//						System.out.printf("│ %3d ", seats[i * 5 + k]);
//
//				}
//				if (i == 9)
//					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
//
//				else
//					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
//			}
//			break;
//		}
//		System.out.print("입력 :");
//		int user = kbd.nextInt();
//		for (int i = 0; i < seats.length; i++) {
//			if (seats[i] == user) {
//				seats[i] = 0;
//
//				int end = 0;
//				int a = 0;
//				int b = 0;
//
//				for (int k = 0; k < 5; k++) {
//					if (seats[i * 5 + k] == 0)
//						a++;
//					if (seats[k * 5 + i] == 0)
//						b++;
//
//				}
//				if (a == user)
//					end++;
//				if (b == user)
//					end++;
//
//				System.out.println("예약완료 :" + end);
//			}
//		}
//
//	}
//}
	      int count=0;
	      int look=0;
	      int booking=0;
	      Scanner kbd = new Scanner(System.in);

	         int[] seats = new int[50];
	         for (int i = 0; i < seats.length; i++) {
	            seats[i] = (int)Math.floor(Math.random() * 2);
	            for (int k = 0; k < i; k++) {
	               break;
	            }
	         }
	         System.out.println("           현재 좌석 현황");

	            System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
	            for (int i = 0; i < 10; i++) {
	               for (int k = 0; k < 5; k++) {
	                  System.out.printf("│ %3d ", seats[i * 5 + k]);
	            
	               }
	               if (i == 9)
	                  System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");

	               else
	                  System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
	            }


	         System.out.print("예약 인원 수 : ");
	         int user = kbd.nextInt();

	
	         while (look < 50) {
	            if (seats[look] == 0) {
	            	count++;
	            	
   
	               if (count == user)
	            	   break;
	            }
	            else {
	              
	            	count=0;
	            }
	            look++;
	         }
	      
	         if (count == user) {
	           
	            look -= user-1;
	   
	            while(booking < user) {
	               seats[look] = 1;
	              
	               look++;
	               booking++;
	            }
	            look++;
	           
	            System.out.printf("%d석 예매 완료 (%d번 ~ %d번)\n", user, look-user, look-1);
	         } else {
	            
	            System.out.println("연속 좌석이 없습니다");

	         }
	      
	   }   
	}
