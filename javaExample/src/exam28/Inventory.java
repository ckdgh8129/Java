package exam28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
	public static void main(String[] args) {		
	
	List<Map <String, String>> mu = new ArrayList<>();
	
	String name = "사과";
	int number = 5;
	int amount = 5000;
	Map <String, String> list = new HashMap<>();
	list.put("이름",name);
	list.put("갯수", number+"");
	list.put("가격", amount+"");
	System.out.println(list);
	
}
}