package test;

public class javattttt {

	public static void main(String[] args) {

		// 1.
		int x = 10;

		if (x > 10 && x < 20) {
			System.out.println(true);
		} else
			System.out.println(false);

		// 2.
		char ch = '	';

		if (ch != ' ' && ch != '	')
			System.out.println(true);
		else
			System.out.println(false);

		// 4-2.
		int a = 0;

		int i;
		for (i = 0; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {

			} else {
				a += i;

			}

		}
		System.out.println(a);

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int k : arr) {
			sum += k;
		}
		System.out.println(sum);

		int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float ave = 0;
		for (int[] n : arr2) {
			total += (n[0] + n[1] + n[2] + n[3] + n[4]);
			ave = (float) (total) / 20;
		}
		System.out.println(total);
		System.out.println(ave);

		//
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int j = 0; j < 20; j++) {
			int b = (int) (Math.random() * ballArr.length);
			int c = (int) (Math.random() * ballArr.length);
			int tmp = 0;
		
			tmp = ballArr[b];
			ballArr[b] = ballArr[c];
			ballArr[c] = tmp;
		}
			System.arraycopy(ballArr, 0, ball3, 0, 3);

			for (int b1 = 0; b1 < ball3.length; b1++)
				System.out.println(ball3[b1]);

		}

	}


