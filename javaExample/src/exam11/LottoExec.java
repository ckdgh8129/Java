package exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoExec {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
	
//		int[] lotto = new int[6];
		Random random = new Random();

		while (lotto.size() < 6) {
			int num = random.nextInt(45) + 1;
			lotto.add(num);
			
		}
System.out.println(lotto);
	}

}
