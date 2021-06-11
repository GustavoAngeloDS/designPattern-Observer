package application;

import controller.AccountController;
import model.Account;
import observer.SimpleObserver;

public class MainProgram {

	public static void main(String[] args) {
	
		final String CURRENT_BALANCE = "Current Balance: ";
		final String WITHDRAW_BALANCE = "Selected withdraw option. Current Balance: ";
		final String DEPOSIT_BALANCE = "Selected deposit option. Current Balance: ";
		
		Account account = new Account(1L, 100.00);
		AccountController accountController = new AccountController(account);
		
		SimpleObserver observador = new SimpleObserver(account);
		
		System.out.println(String.format("%s"+accountController.balanceCheck(), CURRENT_BALANCE));
		System.out.println(String.format("%s"+accountController.withDraw(60.00), WITHDRAW_BALANCE));
		
		System.out.println(String.format("%s"+accountController.deposit(160.00), DEPOSIT_BALANCE));
	
		account.setValue(100.00);
	}
}
