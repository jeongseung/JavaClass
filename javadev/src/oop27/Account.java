package oop27;

import java.util.Arrays;

public class Account {

	//계좌번호
	String accountNo;
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ Arrays.toString(transactions) + ", date=" + date + ", totalTransaction=" + totalTransaction + "]";
	}

	//소유자명
	String name;
	//잔고
	long balance;
	//거래내역(0개 이상)
	Transaction[] transactions = new Transaction[100];
	Date date = new Date();
	//총 거래내역
	int totalTransaction;
	

	public Account() {}
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}
	
	
	
	//입금한다
	void deposit(long amount) {
		String transactionDate = date.day();
		String transcationTime = date.time();
		balance += amount;
		Transaction transaction = new Transaction(transactionDate, transcationTime, 0, amount, balance);
		transactions[totalTransaction] = transaction;
		totalTransaction++;
	}
	
	//출금한다
	void withdraw(long amount) {
		String transactionDate = date.day();
		String transcationTime = date.time();
		balance -= amount;
		Transaction transaction = new Transaction(transactionDate, transcationTime, 0, amount, balance);
		transactions[++totalTransaction] = transaction;
	}
	
	//잔고를 확인한다
	long getBalance() {
		return balance;
	}
	
	//거래내역을 본다
	Transaction[] getTransactions() {
		return transactions;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}
	
	
}
