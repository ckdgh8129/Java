package day20260107;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Test0107 {

	public static void main(String[] args) {
		//

		Scanner kbd = new Scanner(System.in);

		int[] seats = new int[50];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = (int) Math.floor(Math.random() * 2);
			for (int k = 0; k < i; k++) {

				break;
			}
		}

		while (true) {
			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
			for (int i = 0; i < 10; i++) {
				for (int k = 0; k < 5; k++) {
					if (seats[i * 5 + k] == 0) {
						System.out.printf("│ %3c ", '1');
					} else
						System.out.printf("│ %3d ", seats[i * 5 + k]);

				}
				if (i == 9)
					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");

				else
					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
			}
			break;
		}
		System.out.print("입력 :");
		int user = kbd.nextInt();
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == user) {
				seats[i] = 0;

				int end = 0;
				int a = 0;
				int b = 0;

				for (int k = 0; k < 5; k++) {
					if (seats[i * 5 + k] == 0)
						a++;
					if (seats[k * 5 + i] == 0)
						b++;

				}
				if (a == user)
					end++;
				if (b == user)
					end++;

				System.out.println("예약완료 :" + end);
			}
		}

	}
}