package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;      // 추가됨
import java.util.HashMap;

public class Inout_DAO {

    private final String dbDrv = "com.mysql.cj.jdbc.Driver";
    private final String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
    private final String dbUsr = "javauser";
    private final String dbPwd = "1234";

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    private Connection getConnection() throws Exception {
        Class.forName(dbDrv);
        return DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
    }

    private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Inout_DTO makeDTO(ResultSet rs) throws Exception {
        Inout_DTO dto = new Inout_DTO();
        dto.setInoutID(rs.getInt("inout_id"));
        dto.setProductId(rs.getInt("product_id"));
        dto.setInoutType(rs.getInt("inout_type"));
        dto.setQuantity(rs.getInt("quantity"));
        dto.setLogDate(rs.getDate("inout_date"));
        dto.setProductName(rs.getString("product_name")); 
        return dto;
    }

    //1. 전체 목록 조회
    public List<Inout_DTO> getSelectAll() {
        List<Inout_DTO> list = new ArrayList<>();
        Map<Integer, Integer> productStocks = new HashMap<>();

        try {
            conn = getConnection();
            String sql = "SELECT s.*, i.product_name " + //제품 이름
                    "FROM stock_moves s " + //메인 테이블 
                    "JOIN items i ON s.product_id = i.product_id " + //연결기준
                    "ORDER BY s.inout_id ASC"; //오름자순
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Inout_DTO dto = makeDTO(rs);
                int pId = dto.getProductId();
                
                // 해당 제품의 기존 계산된 재고
                int currentStock = productStocks.getOrDefault(pId, 0);

                //  입고(0)면 더하고, 출고(1)면 뺌
                if (dto.getInoutType() == 0) {
                    currentStock += dto.getQuantity();
                } else if (dto.getInoutType() == 1){
                    currentStock -= dto.getQuantity();
                }
                
                // 마이너스 방지
                currentStock = Math.max(0, currentStock);

                // 해당 시점의 제품별 누적 재고 설정
                productStocks.put(pId, currentStock);
                dto.setTotalStock(currentStock);
                
                list.add(dto);
            }

            // 5. 전체 내역을 최신순(역순)으로 정렬
            Collections.reverse(list);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose(rs, pstmt, conn);
        }
        return list;
    }

    // 2. 상품별 이력 조회
    public List<Inout_DTO> getSelectByProduct(int productId) {
        List<Inout_DTO> list = new ArrayList<>();
        try {
            conn = getConnection();
            
            String sql = "SELECT s.*, i.product_name " +
                    "FROM stock_moves s " +
                    "JOIN items i ON s.product_id = i.product_id " +
                    "WHERE s.product_id = ? " +
                    "ORDER BY s.inout_id ASC";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, productId); 
            
            rs = pstmt.executeQuery();

            int runningTotal = 0; // 누적 합계

            while(rs.next()) {
                Inout_DTO dto = makeDTO(rs);
                
                // 0이면 입고, 1이면 출고
                if(dto.getInoutType() == 0) {
                    runningTotal += dto.getQuantity();
                } else if (dto.getInoutType() == 1) {
                    runningTotal -= dto.getQuantity();
                }
                
                // 마이너스 방지: 계산값이 0보다 작으면 0으로 고정
                runningTotal = Math.max(0, runningTotal);
                
                // 계산된 누적치 저장
                dto.setTotalStock(runningTotal);
                list.add(dto);
            }
            
            // 최신순
            Collections.reverse(list);
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            dbClose(rs, pstmt, conn); 
        }
        return list;
    }

    // 3. 기간별 이력 조회 
    public List<Inout_DTO> getSelectByDate(String startDate, String endDate) {
        List<Inout_DTO> list = new ArrayList<>();
        Map<Integer, Integer> productStockMap = new HashMap<>();
        
        try {
            conn = getConnection();
            String sql = "SELECT s.*, i.product_name " +
                    "FROM stock_moves s " +
                    "JOIN items i ON s.product_id = i.product_id " +
                    "WHERE DATE(s.inout_date) BETWEEN ? AND ? " +
                    "ORDER BY s.inout_id ASC";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, startDate);
            pstmt.setString(2, endDate);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Inout_DTO dto = makeDTO(rs);
                int pId = dto.getProductId();

                // 해당 제품의 이전 계산값 
                int currentStock = productStockMap.getOrDefault(pId, 0);

                // 입출고에 따른 제품별 재고 계산
                if (dto.getInoutType() == Inout_DTO.INCOMING) {
                    currentStock += dto.getQuantity();
                } else {
                    currentStock -= dto.getQuantity();
                }
                
                // 계산된 값을 Map에 저장하고 DTO에 세팅
                productStockMap.put(pId, currentStock);
                dto.setTotalStock(currentStock);
                
                list.add(dto);
            }
            
            // 전체 내역을 최신순
            Collections.reverse(list);
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            dbClose(rs, pstmt, conn); 
        }
        return list;
    }
    
 // 4. 입출고 등록
    public int setInsert(Inout_DTO dto) {
        int result = 0;
        
        if (dto.getInoutType() != 0 && dto.getInoutType() != 1) {
            System.out.println("\n[등록 실패] 잘못된 입력입니다. (0: 입고, 1: 출고 중 선택해주세요.)");
            return 0; 
        }
        
        try {
            // 마이너스 재고 방지 체크
            if (dto.getInoutType() == 1) { // 출고인 경우
                List<Inout_DTO> history = getSelectByProduct(dto.getProductId());
                int currentStockBefore = history.isEmpty() ? 0 : history.get(0).getTotalStock();

                if (currentStockBefore < dto.getQuantity()) {
                    System.out.println("\n[출고 실패] 재고가 부족하여 데이터를 등록할 수 없습니다.");
                    System.out.println("현재 재고: " + currentStockBefore + ", 출고 시도: " + dto.getQuantity());
                    return 0; 
                }
            }

            // DB 입력
            conn = getConnection();
            String sql = "INSERT INTO stock_moves (product_id, inout_type, quantity, inout_date) VALUES (?, ?, ?, now())";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getProductId());
            pstmt.setInt(2, dto.getInoutType());
            pstmt.setInt(3, dto.getQuantity());
            result = pstmt.executeUpdate();      
            
            // StockDTO 연동
            if (result > 0) {
                List<Inout_DTO> historyAfter = getSelectByProduct(dto.getProductId()); 
                if (!historyAfter.isEmpty()) {
                    Inout_DTO latest = historyAfter.get(0);
                    int currentStockTotal = latest.getTotalStock();
                    String pName = latest.getProductName(); 

                    System.out.println("\n[시스템 로그] 데이터 등록 성공");
                    StockDTO stockStatus = new StockDTO(pName, currentStockTotal);

                    if (dto.getInoutType() == 1) stockStatus.out(0); 
                    else {
                        System.out.println("입고 완료. 제품: " + pName + " | 현재 재고 : " + currentStockTotal);
                        if (currentStockTotal <= 10) System.out.println("※ 재고 부족 알림");
                    }
                }
            }
        } catch (Exception e) { e.printStackTrace(); } 
        finally { dbClose(null, pstmt, conn); }
        return result;
    }
}