package day20260112;

public class MainBingo {

	public static void main(String[] args) {
		
		BingoGame bingogame = new BingoGame("유리",2,2,5,3);
		
		System.out.println(bingogame);
		
//		BingoGame bingo2 = new BingoGame("유리",2,2,5,3);
//		System.out.println(bingo2);
//		BingoGame bingo3 = new BingoGame("짱아",3,1,2,5);
//		System.out.println(bingo3);
//	}
		bingogame.setName("맹구");
		System.out.println(bingogame.getName());
	}
}
