package day8;

public class AccountVO {
	private int account_id;
	private int deposit;
	private int withdraw;
	private String tr_date;
	private int balance;

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public String getTr_date() {
		return tr_date;
	}

	public void setTr_date(String tr_date) {
		this.tr_date = tr_date;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public AccountVO(int account_id, int deposit, int withdraw, String tr_date, int balance) {
		super();
		this.account_id = account_id;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.tr_date = tr_date;
		this.balance = balance;
	}
	  @Override
	  public String toString() {
	    return "AccountVO [number=" + account_id + ", 입금액: " + deposit + ", 출금액: " + withdraw + ", 날짜=" + tr_date + ", 계좌 총액 : "
	        + balance + "]" + "\n";
	  }

	public AccountVO() {
		
	}


}
