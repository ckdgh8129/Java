package exam13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
//		List<Object> arrayList = new ArrayList<>();
//		System.out.println("1"+arrayList);
//		arrayList.add(1);
//		System.out.println("2"+arrayList);
//		arrayList.add(2);
//		System.out.println("3"+arrayList);
//		arrayList.add("홍길동");
//		System.out.println("4"+arrayList);
//		arrayList.add(true);
//		System.out.println("5"+arrayList);
//		arrayList.add(new int[5]);
//		System.out.println("6"+arrayList);
//		
		LinkedList<String> list = new LinkedList<>();
		System.out.println("1"+ list);
		
		list.add("홍길동");
		System.out.println("2"+list);
		list.add("이상순");
		System.out.println("3"+list);
		list.add("장천용");
		System.out.println("4"+list);
		list.addFirst("1111");
		System.out.println("5"+list);
		list.addFirst("2345");
		System.out.println("6"+list);
		
		
		list.add(1,"2222");
		System.out.println("7"+list);
		
		
		list.removeFirst();
		System.out.println("8"+list);
	}

}
