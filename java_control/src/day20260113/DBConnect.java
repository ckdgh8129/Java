package day20260113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jdk.internal.classfile.CodeBuilder.CatchBuilder;

public class DBConnect {

	private Connection conn; // 데이터 베이스 연결 유지
	private Statement st; // 데이터 베이스에 쿼리문 전달 및 결과 받기
	private ResultSet rs; // 데이터 베이스의 결과를 저장

	public DBConnect() {
		connect();
	}

	private void connect() {
		// 데이터 베이스 접속
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "ho";
			String password = "159123";
			String uri = "jdbc:mysql://localhost:3306/ho";

			conn = DriverManager.getConnection(uri, username, password);

		} catch (Exception e) {
			System.out.println("접속 실패");
			e.printStackTrace();// 오류의 원인 출력
		}
	}

	// product 테이블의 데이터 가져오기
	public Product[] selectData() {
		Product[] products = new Product[0];
		// 쿼리문 작성하기
		String sql = "select * from product";

		// 쿼리문 보내기
		try {
		st = conn.createStatement();
	}catch(Exception e) {
		System.out.println("쿼리문 실패");
	}
		// 결과 받기

		// 데이터들을 product 객체에 저장하기

		return products;
	}

}
