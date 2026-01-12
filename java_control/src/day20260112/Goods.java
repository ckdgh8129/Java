package day20260112;

public class Goods {
//상품명,  상품 가격, 카테고리 , 수량
	private String item; //상품명
	private int price;	//상품 가격
	private String Category; // 카테고리
	private int num;	//수량
	
//	public String getItem() {
//		return item;
//	}
//	public void setItem(String item) {
//		this.item = item;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getCategory() {
//		return Category;
//	}
//	public void setCategory(String category) {
//		Category = category;
//	}
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
	@Override
	public String toString() {
		return "진열상품 [상품명=" + item + ", 가격=" + price +"만원"+", 카테고리=" + Category + ", 갯수=" + num + "]";
	}
	public Goods(String item, int price, String category, int num) {
		super();
		this.item = item;
		this.price = price;
		Category = category;
		this.num = num;
	}
	
//	public void add(String item, int price, String category, int num) {
//		this.item = item;
//		this.price = price;
//		Category = category;
//		this.num = num;
//	}
	
	
}
