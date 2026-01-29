package exam1;

import java.util.Scanner;

public class ProductDTO {

	private int product_id;
	private String product_name;
	private int product_price;

	
	
	public ProductDTO() {
		
	}
	
	// method
	public void inputField(String gubun) {
		Scanner sc = new Scanner(System.in);
		
		if(gubun.equals("sujung") || gubun.equals("sakje") ) {
			System.out.println("제품 번호 : ");
			String product_id_ = sc.nextLine();
			this.product_id = Integer.parseInt(product_id_);			
		}
		
		if(gubun.equals("chuga")) {
			System.out.print("제품 이름 : ");
			this.product_name = sc.nextLine();
			System.out.print("제품 가격 : ");
			this.product_price = sc.nextInt();
			sc.nextLine();
		} else if(gubun.equals("sujung")) {
			System.out.print("제품 이름 : ");
			this.product_name = sc.nextLine();
			System.out.print("제품 가격 : ");
			this.product_price = sc.nextInt();
			sc.nextLine();
		}
	}
	
	public void display() {
		System.out.printf("%d \t %s \t %d \t \n", product_id, product_name, product_price);
		}
	


	



	// toString
	@Override
	public String toString() {
		return "제품 수정 [제품 번호 : " + product_id + ", 제품 이름 : " + product_name + ", 제품 가격 : "
				+ product_price + "]";
	}

	// getter & setter
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	


	
	
	
}
