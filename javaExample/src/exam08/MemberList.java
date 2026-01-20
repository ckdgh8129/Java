package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {

	public static void main(String[] args) {
		
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
//			//--------------------------------------------------------------
			
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String pw = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String createdDate = rs.getString("createdDate");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t\n", no,id, name, phone, createdDate);
				
			}
			
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
