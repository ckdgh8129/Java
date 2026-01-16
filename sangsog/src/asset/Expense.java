package asset;

import deal.Transaction;

public class Expense extends Transaction{


	public Expense(int money, String date, String memo) {
		super(money,date,memo);
	}

	@Override
	public String toString() {
		return "[지출]Epense" + super.toString();
	}
	
	
	
}
