package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		
//		Student s1 = new Student("고길동",80);
//		Student s2 = new Student("둘리",90);
		Student s3 = new Student("박희동",100);
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("고길동",80));
		list.add( new Student("둘리",90));
		list.add(s3);
		
		//람다를 이용한 정렬( 점수 내림차순)
		list.sort((s1, s2)->s2.score-s1.score);
		
		System.out.println("성적순 정렬 결과");
		System.out.println(list);
		

	}

}
