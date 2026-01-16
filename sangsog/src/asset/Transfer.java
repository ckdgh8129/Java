package asset;

import deal.Transaction;

public class Transfer extends Transaction{

	public Transfer(int money, String date, String memo) {
		super(money,date,memo);
	    
	}

	@Override
	public String toString() {
		return "[이체]Transfer"+ super.toString();
	}
	

		
	
	
	
}
