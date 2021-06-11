package service;

import model.Account;

public class AccountService {

	Account account;
	
	public AccountService(Account account){
		this.account = account;
	}	
	
	public double balanceCheck() {
		return account.getBalance();
	}
	
	public double withDraw(double withdrawValue) {
		if(account.getBalance() >= withdrawValue) {
			account.setBalance(account.getBalance() - withdrawValue);
		}
		return account.getBalance();
	}
	
	public double deposit(double depositValue) {
		account.setBalance(account.getBalance() + depositValue);
		return account.getBalance();
	}
}
