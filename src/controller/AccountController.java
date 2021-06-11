package controller;

import model.Account;
import service.AccountService;

public class AccountController {

	AccountService accountService;
	Account account;
	
	public AccountController(Account account){
		this.account = account;
		accountService = new AccountService(account);
	}
	
	public double balanceCheck() {
		return accountService.balanceCheck();
	}
	
	public double withDraw(double withdrawValue) {
		return accountService.withDraw(withdrawValue);
	}
	
	public double deposit(double depositValue) {
		return accountService.deposit(depositValue);
	}
}
