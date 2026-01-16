package deal;


public abstract class Transaction {
	
	
	
	
	protected int money;
	protected String date;
	protected String memo;
	
	public int getMoney() {
	    return this.money;
	}
	public Transaction() {
		
	}

	public Transaction(int money, String date, String memo) {
		
		this.money = money;
		this.date = date;
		this.memo = memo;
	}

	@Override
	public String toString() {
		return " [금액=" + money + ", 날짜=" + date + ", 메모=" + memo + "]";
	}
	
	
}
