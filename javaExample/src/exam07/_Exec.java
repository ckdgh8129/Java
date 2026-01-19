package exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름 국어 영어 수학
		// 이름 국어 영어 수학 총점 평균 3인분량

		Scanner sc = new Scanner(System.in);

		List<Student> list = new ArrayList<>(); // (홍길동,0,0,0,???,???),(strs),(strs)

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
			String mat_ = sc.nextLine();

			int kor = Integer.parseInt(kor_);
			int eng = Integer.parseInt(eng_);
			int mat = Integer.parseInt(mat_);

		
			
			Student student = new Student(name,kor,eng,mat);
		
		
			
			list.add(student);
		}
		for (int i=0; i<list.size(); i++) {
			list.get(i).display();
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t",s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getTot(),s.getAvg());
		}
	}
	
}
