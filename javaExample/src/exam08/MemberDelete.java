package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberDelete {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javauser";
		String dbpwd = "1234";

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디: ");
		String id = sc.nextLine();
		
		sc.close();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbpwd);
//			//--------------------------------------------------------------
			
			String sql ="delete from member where id=?";
	
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("삭제성공");
			}else
				System.out.println("삭제실패");
			
		
			
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
