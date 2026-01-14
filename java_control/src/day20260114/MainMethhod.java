package day20260114;

public class MainMethhod {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		GameMenber[] gameMenbers = connect.findAll();
		
		System.out.println(gameMenbers[2]);
		
	}

}
