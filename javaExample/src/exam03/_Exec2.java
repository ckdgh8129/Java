package exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Exec2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(50); //[50]
		list.add(10); //[50, 10]
		list.add(30); //[50, 60, 30]
		
		//1.오름차순 정렬(기본)
		Collections.sort(list);
		System.out.println("오름차순");
		//2. 내림차순 정렬
		Collections.sort(list,Collections.reverseOrder());
	}

}
