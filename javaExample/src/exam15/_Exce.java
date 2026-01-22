package exam15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Exce {

	public static void main(String[] args) {

		List<Map<String, String>> list = new ArrayList<>();

		String name = "라면";
		int price = 1000;
		int number = 5;
		int tot = price*number;
		Map<String, String> map1 = new HashMap<>();
		map1.put("이름", name);
		map1.put("개당가격", price + "");
		map1.put("개수", number + "");
		map1.put("총가격", tot + "");
		list.add(map1);

		name = "맥주";
		price = 5000;
		number = 3;
		tot = price*number;

		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", name);
		map2.put("개당가격", price + "");
		map2.put("개수", number + "");
		map2.put("총가격", tot + "");
		list.add(map2);

		name = "소주";
		price = 5000;
		number = 2;
		tot = price*number;
		
		Map<String, String> map3 = new HashMap<>();
		map3.put("이름", name);
		map3.put("개당가격", price + "");
		map3.put("개수", number + "");
		map3.put("총가격", tot + "");
		list.add(map3);
		
		for (int i=0; i<list.size(); i++) {
			Map<String, String> map = list.get(i);
			String msg = "";
			msg += ","+ map.get("tot");
		System.out.println(map);
		System.out.println(msg);
		}
		
	}

}
