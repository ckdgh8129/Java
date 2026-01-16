package dto;

import able.CafeOrder;

public abstract class BasseOrder implements CafeOrder{

	protected String cafeName;
	protected String menuName;
	
	public BasseOrder(String cafeName, String menuName) {
		this.cafeName=cafeName;
		this.menuName=menuName;
	}

	public void takeOrder() {
		System.out.println("["+cafeName+"] 주문접수"+menuName);
	}
	

	
}
