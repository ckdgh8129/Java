package day20260102;

import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		
		int time;
		int base = 1000;
		int min;
		int addbase = 2500;
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("주차시간(분): ");
		time = kbd.nextInt();

		if(time >= 240 ) {
			for(min=250; time >= min; min+=10 ) {
			addbase+= 100;	
			}
			System.out.println("금액: "+addbase+"원");
		}
		else if(time >= 30) {
			for(min=40; time >= min; min+=10 ) {
				base+= 100;
		}
			System.out.println("금액: "+base+"원");
		}
		else {
			System.out.println("금액: "+base+"원");
	}
	}
}
