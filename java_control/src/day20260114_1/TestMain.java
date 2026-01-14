package day20260114_1;

public class TestMain {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		Item[] item = connect.findAll();
		
		System.out.println(item[6]);
		
	}

}
