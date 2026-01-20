package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberInsert {

	public static void main(String[] args) {

		/*
		 * int a = 5; int b = 0; try {
		 * 
		 * 
		 * double c = a/b; System.out.println("c:" + c); }catch (Exception e) {
		 * System.out.println(b+"으로 나누어서 종료"); }finally {
		 * System.out.println("에고 ... 에러났네..."); }
		 * System.out.println("====프로그램 종료====");
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.println(id);
		System.out.print("비밀번호: ");
		String pw = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phone = sc.nextLine();
		sc.close();

		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javauser";
		String dbpwd = "1234";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbpwd);
//				---------------------------------------------------------------
			String sql = "";
			sql += "insert into member(no, id, password, name, phone, createdDate) values";
			sql += "(null,?,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("등록성공");
			}else
				System.out.println("등록실패");
			//-------------------------------------------------------------
		} catch (Exception e) {
			System.out.println("드리이버 로딩 실패..또는 접속 실패..");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("== 프로그램 종료 ==");
	}

}
