package exam11;

import java.util.HashSet;
import java.util.Set;

public class _Exce {

	public static void main(String[] args) {
		//Set - 중복을 허용하지 않는다
		Set<String> set = new HashSet<>();
		System.out.println(set);
		set.add("사과");
		System.out.println(set);
		set.add("바나나");
		System.out.println(set);
		set.add("포도");
		System.out.println(set);
		set.add("사과");
		System.out.println(set);
		System.out.println("담긴계수: "+set.size());
		
		if(set.contains("사과")) {
			System.out.println("사과가 썩었네....");
		}
		for (String s: set) {
			System.out.println(s);
		}
	
		if (set.contains("체리")){
			set.remove("체리");
			set.add("cherry");
			System.out.println(set);
		}
	}

}
