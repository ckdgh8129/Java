package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		//리스트 : 큰가방
		List<Integer> list = new ArrayList<>(); //리스트 생성
		//제너릭
		System.out.println("List : "+list);//[]
		
		list.add(1);
		System.out.println("List : "+list);//[1]
		
		list.add(2);
		System.out.println("List : "+list);//[1, 2]
		
		list.add(300);
		System.out.println("List : "+list);//[1, 2, 300]
		
//		list.add("long");
//		System.out.println("List : "+list);// 제너릭을 정수로 정했기에 문자열은 불가능하다
		
		System.out.println("리스트길이 :"+list.size());
//		System.out.println("리스트의 0번째 인덱스의 값"+list.get(0));
//		System.out.println("리스트의 1번째 인덱스의 값"+list.get(1));
//		System.out.println("리스트의 2번째 인덱스의 값"+list.get(2));
//		
		for (int i=0; i<list.size(); i++) {
			
			System.out.println("리스트의"+i+"번째 인덱스의 값 : "+list.get(i));
		}
		
		list.remove(2);
		System.out.println("--------------------");
		
		for (int i=0; i<list.size(); i++) {
			
			System.out.println("리스트의"+i+"번째 인덱스의 값 : "+list.get(i));
		}
		
		System.out.println("--------------------");
		list.set(0, 100);
		for (int i=0; i<list.size(); i++) {
			
			System.out.println("리스트의"+i+"번째 인덱스의 값 : "+list.get(i));
		
		}
		//공통 모듈
		System.out.println("--------------------");
		int i=0;
		for (int a : list) {
			
			System.out.println("리스트의"+i+"번째 인덱스의 값 : "+list.get(i));
			i++;
		}
	
	
	}

}
