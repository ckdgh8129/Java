package exam1;

public class StockMoves {
		private int productId;
		private int inoutType; // 0입고  1출고
		private int quantity;
		private String inoutDate;
		
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
		public String getInoutDate() {
			return inoutDate;
		}
		public void setInoutDate(String inoutDate) {
			this.inoutDate = inoutDate;
		}
	
		 public StockMoves(int productId, int inoutType, int quantity, String inoutDate) {
		        this.productId = productId;
		        this.inoutType = inoutType;
		        this.quantity = quantity;
		        this.inoutDate = inoutDate;
		    }
	    
		public String getTypeName() {
		        return (this.inoutType == 0) ? "입고" : "출고";
		    }
	    
	    
	    
}
