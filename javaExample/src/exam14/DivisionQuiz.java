package exam14;

import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 :");
		String num1_ = sc.nextLine();
		
		int num1;
		try {
			num1 = Integer.parseInt(num1_);
		} catch (Exception e) {
			num1=-1;
		}
		System.out.println(num1);
//		int num1 = Integer.parseInt(num1_);
		
//		System.out.println(num1);
//		System.out.print("두번째 정수 :");
//		int num2 = sc.nextInt();
//		
//		int result = num1/num2;
//		System.out.println("결과: "+ num1+ " / " + num2+ " / "+ result);
//		
		
		
		
	}

}
