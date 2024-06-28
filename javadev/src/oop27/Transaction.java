package oop27;

//거래내역
public class Transaction {
	//거래일
	String transactionDate;
	//거래시간
	String transactionTime;
	//구분(입금 또는 출금) 0입금 1출금
	long kind;
	//거래금액
	long amount;
	//잔고
	long balance;
	
	public Transaction(long amount, long balance) {
		this.amount = amount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}

	public Transaction(String transactionDate, String transactionTime, long kind, long amount, long balance) {
		super();
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public long getKind() {
		return kind;
	}
	public void setKind(long kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	


}

