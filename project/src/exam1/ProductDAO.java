package exam1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDAO {

	String dbDrv = "com.mysql.cj.jdbc.Driver";

	String dbUrl = "jdbc:mysql://localhost:3306/javaexample?serverTimezone=Asia/Seoul";
	String dbUsr = "javauser";
	String dbPwd = "1234";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// close 메서드
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
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
	} // close 메서드 밖

	// 1번 select(목록) 메서드
	public List<ProductDTO> getSelcetAll() {
		List<ProductDTO> list = new ArrayList<>();

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// --------------------------------------------
			String sql = "select * from items order by product_id desc";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_price(rs.getInt("product_price"));
				list.add(dto);
			}

			// --------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return list;

	} // select 메서드 밖

	
	// 3번 insert 메서드
	public int setInsert(ProductDTO dto) {

		int result = 0;

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// --------------------------------------------
			String sql = "";
			sql += "insert into items (product_id, product_name, product_price) values";
			sql += "(null, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getProduct_price());

			result = pstmt.executeUpdate(); // 0, 1

			// --------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return result;
	} // insert 메서드 밖
	
	// 4번 수정 메서드 update student set phone =?, address = ? where hakbun = ?
	
	public ProductDTO setUpdate(ProductDTO dto) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// --------------------------------------------
			
			String sql = "update items set product_name =?, product_price = ? where product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getProduct_price());
			pstmt.setInt(3, dto.getProduct_id());
			int result = pstmt.executeUpdate(); // 0, 1

			// --------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return dto;
	}

	// 5번 삭제 메서드
	public int setDelete (ProductDTO dto) {	
	
		int result = 0;
		
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// --------------------------------------------
			String sql = "delete from items where product_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getProduct_id());

			result = pstmt.executeUpdate(); // 0, 1

			// --------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		
		
		return result;
	}
	
}
