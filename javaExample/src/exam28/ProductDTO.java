package exam28;



public class ProductDTO {
	
	private String productName;
	private int productPrice;
	private int buyCounter;
	private int total;
	
	
	public ProductDTO(String productName, int productPrice, int buyCounter) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.buyCounter = buyCounter;
		this.total = productPrice * buyCounter;
	}
	//method
	public void display() {
		System.out.printf("%s\t %d\t %d\t %d\n", productName, productPrice, buyCounter, total);
	}
		
		
		
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getBuyCounter() {
		return buyCounter;
	}
	public void setBuyCounter(int buyCounter) {
		this.buyCounter = buyCounter;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
