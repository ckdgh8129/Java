package day20260112;

public class MainMethod2 {

	public static void main(String[] args) {
		
		board board = new board("점심메뉴판","박문수",45);
		System.out.println(board);
		
		board.hitUp("이순신");
		System.out.println(board);
		
		board.hitUp("박문수");
		System.out.println(board);
		
		board.updateTitle("김김김","아침메뉴판");
		System.out.println(board);
		
		board.updateTitle("박문수","저녁메뉴판");
		System.out.println(board);
		
	}

}
