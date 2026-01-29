package exam1;
import java.util.List;
import java.util.Scanner;

public class Inout_Main {
    public static void main(String[] args) {
        Inout_DAO dao = new Inout_DAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= [ 재고 입출고 관리 시스템 ] =========");
            System.out.println("1. 전체 이력 조회");
            System.out.println("2. 상품별 이력 조회");
            System.out.println("3. 기간별 이력 조회");
            System.out.println("4. 입출고 내역 등록");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1: // 전체 조회
                    List<Inout_DTO> allList = dao.getSelectAll();
                    printResult(allList);
                    break;

                case 2: // 상품별 조회
                    System.out.print("조회할 제품 ID 입력: ");
                    int pId = sc.nextInt();
                    List<Inout_DTO> pList = dao.getSelectByProduct(pId);
                    printResult(pList);
                    break;

                case 3: // 기간별 조회
                    System.out.print("시작 날짜 (예: 2024-01-01): ");
                    String start = sc.next();
                    System.out.print("종료 날짜 (예: 2024-12-31): ");
                    String end = sc.next();
                    List<Inout_DTO> dList = dao.getSelectByDate(start, end);
                    printResult(dList);
                    break;

                case 4: // 등록
                    Inout_DTO dto = new Inout_DTO();
                    System.out.print("제품 ID: ");
                    dto.setProductId(sc.nextInt());
                    System.out.print("구분 (0:입고, 1:출고): ");
                    dto.setInoutType(sc.nextInt());
                    System.out.print("수량: ");
                    dto.setQuantity(sc.nextInt());

                    int res = dao.setInsert(dto);
                    if (res > 0) System.out.println("▶ 등록 성공!");
                    else System.out.println("▶ 등록 실패.");
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
        sc.close();
    }

    // 결과를 깔끔하게 표 형태로 출력하는 보조 메서드
    private static void printResult(List<Inout_DTO> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("조회된 내역이 없습니다.");
            System.out.println("======================================================");
            return;
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("번호\t제품ID\t구분\t수량\t날짜");
        System.out.println("----------------------------------------------------------");
        for (Inout_DTO d : list) {
            String type = (d.getInoutType() == 0) ? "입고" : "출고";
            System.out.printf("%d\t%d\t%s\t%d\t%s\n", 
                d.getInoutID(), d.getProductId(), type, d.getQuantity(), d.getLogDate());
        }
        System.out.println("----------------------------------------------------------");
    }
}