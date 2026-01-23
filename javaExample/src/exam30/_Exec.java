package exam30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료 ");
			String menu= sc.nextLine();
			switch(menu) {
			case "1":
				System.out.println("목록");
				break;
			case "2":
				System.out.println("상세보기");
				break;
			case "3":
//				StudentDTO dto = new StudentDTO();
				String name = "이상순";
				String ssn = "123456-1234567";
				String phone = "010-0000-1111";
				String address = "서울";
				Map<String, String> map = new HashMap<>();
				map.put("name", name);
				map.put("ssn", ssn);
				map.put("phone", phone);
				map.put("address", address);
				
				StudentDAO dao = new StudentDAO();
				int result = dao.setInsert(map);
				System.out.println("result : "+result);
				break;
			case "4":
				System.out.println("수정");
				break;
			case "5":
				System.out.println("삭제");
				break;
			default:
				System.out.println("<<<프로그램 종료>>>");
				return;
				
			}
		}
	
	}

}
