package asset;

import deal.Transaction;

public class Income extends Transaction{


	public Income(int money, String date, String memo) {
		super(money,date,memo);
	}

	@Override
	public String toString() {
		return "[입금]Income"+super.toString();
	}
	
	
	
}
