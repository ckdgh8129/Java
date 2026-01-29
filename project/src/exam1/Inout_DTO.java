package exam1;

import java.sql.Date;
import java.util.List;


public class Inout_DTO {
	private int inoutID;
    private int productId;
    private int inoutType; // 0: 입고, 1: 출고
    private int quantity;
    private Date logDate;
    private int totalStock;
    private String productName;
    
    public static final int INCOMING = 0; //입고
    public static final int OUTGOING = 1; //출고
   
	public Inout_DTO() {

	}
	
	public void printResult(List<Inout_DTO> list) {
	    if (list == null || list.isEmpty()) {
	        System.out.println("\n[결과] 조회된 내역이 없습니다.");
	        return;
	    }
	    System.out.println("\n=========================== 입/출고 이력 내역 ===========================");
	    System.out.println("기록ID\t상품ID\t상품명\t\t구분\t수량\t날짜\t\t누적재고");
	    System.out.println("-----------------------------------------------------------------------");
	    
	    for (Inout_DTO dto : list) {
	        String typeStr = (dto.getInoutType() == INCOMING) ? "입고" : "출고";
	        
	      
            System.out.printf("%d\t%d\t%-10s\t%s\t%d\t%s\t%d\n",
    	            dto.getInoutID(),     
    	            dto.getProductId(),    
    	            dto.getProductName(),  
    	            typeStr,               
    	            dto.getQuantity(),    
    	            dto.getLogDate().toString(), 
    	            dto.getTotalStock()   
    	        );
    	    }
        System.out.println("============================================================\n");
    }
	

	public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

	public int getInoutID() {
		return inoutID;
	}

	public void setInoutID(int inoutID) {
		this.inoutID = inoutID;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getInoutType() {
		return inoutType;
	}

	public void setInoutType(int inoutType) {
		this.inoutType = inoutType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	
	public int getTotalStock() {
	    return totalStock;
	}

	public void setTotalStock(int totalStock) {
	    this.totalStock = totalStock;
	}

}