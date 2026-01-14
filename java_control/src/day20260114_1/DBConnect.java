package day20260114_1;

import java.sql.*;

public class DBConnect {

	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public DBConnect() {
		connect();
	}

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="ho";
			String password="159123";
			String url="jdbc:mysql://localhost:3306/ho";
			conn = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			System.out.println("접속실패");
			
		}
	}

	public Item[] findAll() {
		Item[] item = new Item[7];
		
		String sql = "select * from item";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i =0;
			while(rs.next()) {
				Item data = new Item(rs.getString("item_name"),rs.getInt("item_price"),
						rs.getString("item_main_image"), rs.getInt("item_stock"));
				item[i] = data;
				i++;
			}
		} catch (Exception e) {
			System.out.println("객체생성 실패");
		}
		return item;
	}
}
