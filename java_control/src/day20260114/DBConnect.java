package day20260114;

import java.nio.channels.Pipe.SourceChannel;
import java.sql.*;

public class DBConnect {

		private Connection conn;
		private Statement st;
		private ResultSet rs;
		// 위에 3가지 사용시 try{} catch 사용
		public DBConnect() {
			connect(); // 데이터 베이스 연결을 위한 메서드
		}
		
		public void connect() {
			//데이터 베이스 드라이버 실행 - 연결
			// 계정 로그인
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String username="ho";
				String password="159123";
				String url = "jdbc:mysql://localhost:3306/ho";
				conn = DriverManager.getConnection(url,username,password);
				
			}catch (Exception e) {
				System.out.println("접속 실패");
				 e.printStackTrace();
			}
		}
		
		public GameMenber[] findAll() {
			GameMenber[] gameMenbers= new GameMenber[10];
			
			//쿼리문 작성
			//쿼리문 보내기
			// 결과받기
			// 데이터를 클래스 객체에 저장하고 배열에 저장하기
			
			String sql = "select * from game_member";
			try {
				st = conn.createStatement();
				rs = st.executeQuery(sql);
				
				int i=0;
				while(rs.next()) {
					GameMenber data = new GameMenber(
							rs.getString("name"),rs.getString("birth"),
							rs.getString("nick_name"),rs.getInt("level"));
							gameMenbers[i]=data;
							i++;
				}
			}catch (Exception e) {
				System.out.println("질의 실패 밎 객체생성 실패");
			}
			return gameMenbers;
			
			}
		}
		

