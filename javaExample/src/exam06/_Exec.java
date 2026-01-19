package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름 국어 영어 수학
		// 이름 국어 영어 수학 총점 평균 3인분량

		Scanner sc = new Scanner(System.in);

		List<String[]> list = new ArrayList<>(); // (홍길동,0,0,0,???,???),(strs),(strs)

		while (true) {

			System.out.print("이름 : ");
			String name = sc.nextLine();
			if (name.toLowerCase().equals("q")) {//소문자를 대문자로 바꿨을때도 나갈수있다!
				break;
			}

			System.out.print("국어 : ");
			String kor_ = sc.nextLine();

			System.out.print("영어 : ");
			String eng_ = sc.nextLine();

			System.out.print("수학 : ");
			String math_ = sc.nextLine();

			int kor = Integer.parseInt(kor_);
			int eng = Integer.parseInt(eng_);
			int math = Integer.parseInt(math_);

			int tot = kor + eng + math;
			double avg = tot / 3.0;

//		String imsi = name+","+kor + "," + eng+","+math+"," +tot+"," +avg;
			String[] strs = new String[6];
			strs[0] = name;
			strs[1] = kor + "";
			strs[2] = String.valueOf(eng);
			strs[3] = math + "";
			strs[4] = tot + "";
			strs[5] = avg + "";

			list.add(strs); //데이터 베이스에 저장할땐 여기에 데이터 베이스에 넣으면된다
		}
		for (int i = 0; i < list.size(); i++) {
			String[] strs = list.get(i);
			System.out.printf("%s \t %s \t %s\t%s\t%s\t%s\t\n", strs[0], strs[1], strs[2], strs[3], strs[4], strs[5]);
		}

	}

}
