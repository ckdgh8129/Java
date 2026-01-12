package day20260112;

public class BingoGame {
//	static String Bingo;
	// 사용자명 , 레벨 , 승, 패, 무
	// 저장할수 있는 객체가 생성될수있게 만들기
	// 모든 인스턴스 변수는 privete 으로
	// 생성자메서드를 통해 사용자명. 레벨. 승.패.무
	// 입력받을수있게 하기
	// 출력 메서드 만들기
	
	private String name;
	private int level;
//	private String win;
//	private String lose;
//	private String drow;
	private int win;
	private int lose;
	private int drow;
	
	public BingoGame() {}
	public BingoGame(String name, int level, int win, int lose, int drow) {
		this.name = name;
		this.level = level;
		this.win = win;
		this.lose = lose;
		this.drow = drow;
	}
	public String toString() {
		return name+" : "+level+" lv: "+"승:"+win+" 패:"+lose+" 무:"+drow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		if( win<0 ) {
			System.out.println("잘못된 입력입니다.");
		}
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDrow() {
		return drow;
	}
	public void setDrow(int drow) {
		this.drow = drow;
	}
	
	 //private 지정된 변수 사용법
	// private 접근제어자는 내부에서만 사용이 가능하기 때문에
	// 외부에서 사용되기 위해 변수들의 set, get 메서드를 만들어 사용한다
	
	//우클릭 source -> getter and setter 
	
}
