package oop27;

public class Bank {
	Account[] accounts = new Account[100];
	int totalAccount;
	
	//계좌를 생성한다
	void addAccount(String accountNo, String name) {
		totalAccount++;
		accounts[totalAccount] = new Account(accountNo, name);
		
	}
	
	//계좌를 찾는다(계좌번호로)
	Account getAccount(String accountNo) {
		for(Account ac : accounts) {
			if(ac.accountNo == accountNo) {
				return ac;
			}
		}
		return null;
	}
	
	//계좌를 찾는다(소유자명으로)
	Account[] findAccounts(String name) {
		int cnt = 0;
		Account[] tempAccount = new Account[totalAccount];
		for(int i=0; i<totalAccount; i++) {
			if(accounts[i].name == name) {
				tempAccount[cnt] = accounts[i];
				cnt++;
			}
		}
		Account[] findAccount = new Account[cnt];
		for(int i=0; i<cnt; i++) {
			
		}
		return null;
	}
	
	//계좌목록을 본다
	int getTotalAccount() {
		int a = 4;
		return a;
	}

	//총 계좌 수를 반환한다
	public Account[] getAccounts() {
		
		return ;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void setTotalAccount(int totalAccount) {
		this.totalAccount = totalAccount;
	}
	
	
	
}
