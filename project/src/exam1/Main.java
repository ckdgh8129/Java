package exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 ProductDAO pDao = new ProductDAO(); 
	        Inout_DAO iDao = new Inout_DAO();

		while (true) {
			System.out.print("(상품관리) 1.목록, 2.상품등록, 3.상품수정, 4.상품삭제, 5.출고, 6.입고, 7.입출고 이력 조회, 0.종료 : ");
			String user = sc.nextLine();

			if (user.equals("0")) {
				System.out.println("===프로그램 종료===");
				break;

			} else if (user.equals("1")) {
				List<ProductDTO> list = pDao.getSelcetAll();
                System.out.println("ID \t 이름 \t 가격");
                for(ProductDTO p : list) p.display();

			} else if (user.equals("2")) {
				ProductDTO dto = new ProductDTO();
                dto.inputField("chuga"); 
                int res = pDao.setInsert(dto);
                if(res > 0) System.out.println("상품이 등록되었습니다.");

			} else if (user.equals("3")) {
				ProductDTO dto = new ProductDTO();
                dto.inputField("sujung"); 
                pDao.setUpdate(dto);
                System.out.println(dto.getProduct_id() + "번 상품 정보가 수정되었습니다.");

			} else if (user.equals("4")) {
				 ProductDTO dto = new ProductDTO();
	                dto.inputField("sakje");
	                int res = pDao.setDelete(dto);
	                if (res > 0) System.out.println(dto.getProduct_id() + "번 상품이 삭제되었습니다.");
	                else System.out.println("삭제 실패 (번호를 확인하세요).");
	                
			}else if (user.equals("5") || user.equals("6")) {
	                 
	                    Inout_DTO iDto = new Inout_DTO();
	                    
	                    System.out.print("대상 상품 ID 입력: ");
	                    iDto.setProductId(Integer.parseInt(sc.nextLine()));
	                    
	                    System.out.print("수량 입력: ");
	                    iDto.setQuantity(Integer.parseInt(sc.nextLine()));
	                    
	                   
	                    int type = user.equals("5") ? 1 : 2; 
	                    iDto.setInoutType(type);
	                    
	                    int res = iDao.setInsert(iDto);
	                    if(res > 0) {
	                        String label = (type == 1) ? "입고" : "출고";
	                        System.out.println(label + " 처리가 완료되었습니다.");
	                    } else {
	                        System.out.println("처리 실패. 상품 번호를 확인하세요.");
	                    }
				
			
//			} else if (user.equals("7")) {
//				System.out.println("조회할 상품 : ");
//				String productName = sc.nextLine();
//
//				List<StockMoves> movesList = new ArrayList<>();
//
//				String sql = "SELECT h.productId, h.inoutType, h.quantity, h.inoutDate " + "FROM Stock_History h "
//						   + "JOIN Products p ON h.productId = p.productId "
//						   + "WHERE p.productName = ? AND h.inoutDate BETWEEN ? AND ?";
//				// DB데이터 넣는공간
//
//				if (movesList.isEmpty()) {
//					System.out.println("조회된 이력이 없습니다.");
//				} else {
//			
//					for (StockMoves m : movesList) {
//						String typeStr = (m.getInoutType() == 0) ? "입고" : "출고";
//					    
//					    System.out.println("날짜: " + m.getInoutDate() + 
//					                       " | 구분: " + typeStr + 
//					                       " | 수량: " + m.getQuantity());
//					}
//				}
			} else {
				System.out.println("없는선택지입니다. 다시 입력해주세요");
			}
		}
	}
}
