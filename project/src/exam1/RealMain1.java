package exam1;



import java.awt.DefaultFocusTraversalPolicy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RealMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("선택(1:제품 목록보기, 2:제품 등록, 3:제품 수정, 4:제품 삭제,");
			System.out.println(" 5:입/출고 내역보기, 6:제품별 이력보기, 7:기간별 이력보기, 8:입/출고 등록, 기타:종료):");
			String menu = sc.nextLine();
			ProductDAO productDAO = new ProductDAO();
			ProductDTO productDTO = new ProductDTO();
			Inout_DAO inout_DAO =  new Inout_DAO();
	        Inout_DTO inout_DTO = new Inout_DTO();
			int result = 0;
			
			switch (menu) {
			case "1": // 제품 목록 보기
				System.out.println("====================== 제품 목록 보기 ======================");
//				StudentDAO dao = new StudentDAO();
				List<ProductDTO> list = productDAO.getSelcetAll();
				System.out.println("제품 번호 \t 제품 이름 \t 제품 가격");
				System.out.println("---------------------------------------------------------");
				for(int i=0; i<list.size();i++) {
					list.get(i).display();
				}				
				System.out.println("=========================================================");
				break;
				
				
			case "2": // 제품 등록
				System.out.println("======================== 제품 등록 ========================");
				productDTO.inputField("chuga");
//				StudentDAO dao = new StudentDAO();
				result = productDAO.setInsert(productDTO);
				System.out.println("=========================================================");
				
				System.out.println("result : "+result);
				break;
				
			case "3": // 제품 수정
				System.out.println("====================== 제품목록 수정 ======================");
				productDTO.inputField("sujung");
				productDAO.setUpdate(productDTO);
				System.out.println(productDTO);
				System.out.println("========================================================");
				break;
				
			case "4": // 제품 삭제
				System.out.println("======================== 제품 삭제 ========================");
				productDTO.inputField("sakje");
				result = productDAO.setDelete(productDTO);
				System.out.println("result : "+result);
				System.out.println("=========================================================");
				break;
				
			case "5": // 재고 입/출고 내역 조회

				System.out.println("=====================  입/출고 내역보기 =====================");
                List<Inout_DTO> allList = inout_DAO.getSelectAll();
                inout_DTO.printResult(allList);
				break;
				
			case "6": // 상품별 이력 조회
				System.out.println("=====================  제품별 이력 보기 =====================");
                System.out.print("조회할 상품 ID 입력: ");
                int pId = sc.nextInt();
                sc.nextLine();
                List<Inout_DTO> pList = inout_DAO.getSelectByProduct(pId);
                inout_DTO.printResult(pList);
				break;
				
			case "7": // 기간별 이력 조회
				System.out.println("=====================  기간별 이력 보기 =====================");
                System.out.print("시작 날짜 (예: 2024-01-01): ");
                String start = sc.nextLine();
                System.out.print("종료 날짜 (예: 2024-12-31): ");
                String end = sc.nextLine();
                List<Inout_DTO> dList = inout_DAO.getSelectByDate(start, end);
                inout_DTO.printResult(dList);
                System.out.println("==========================================================");
				break;
				
			case "8": // 입/출고 등록
				System.out.println("======================= 입/출고 등록 =======================");
                System.out.print("제품 ID: ");
                inout_DTO.setProductId(sc.nextInt());
                sc.nextLine();
                System.out.print("구분 (0:입고, 1:출고): ");
                inout_DTO.setInoutType(sc.nextInt());
                sc.nextLine();
                System.out.print("수량: ");
                inout_DTO.setQuantity(sc.nextInt());
                sc.nextLine();

                int res = inout_DAO.setInsert(inout_DTO);
                if (res > 0) { System.out.println("▶ 등록 성공!");}
                else {System.out.println("▶ 등록 실패.");}
                break;
				
			default:
				System.out.println("- 프로그램 종료 -");
				return;
			}

		}

	}

}