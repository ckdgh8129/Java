package exam09;

import java.util.HashMap;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		//HashMap(맵)	->key, value
		HashMap<String, String> map = new HashMap<>();
		System.out.println(map);

		map.put("name", "홍길동");
		System.out.println(map);
		map.put("kor", 90+"");
		System.out.println(map);
		map.put("eng", 80+"");
		System.out.println(map);
		map.put("name", "이상순");
		System.out.println(map);
		System.out.println("--->"+map.get("name"));
		System.out.println("--->"+map.get("kor"));
		map.put("name", "장천용");
		System.out.println("--->"+map.get("name"));
		
		System.out.println(map.keySet());
		
//		Map<Integer,String> map2 = new HashMap<>();
//		map2.put(1, "금마리");
//		System.out.println("--->"+map2.get(1));
//		map2.put(2, "금준장");
//		System.out.println("--->"+map2);
		for (String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
	
		
	}

}
