package observer;

import java.util.Observable;
import java.util.Observer;

import model.Account;

public class SimpleObserver implements Observer{
	private double value;
	private Account account;
	
	public SimpleObserver(Account account) {
		this.account = account;
		account.registerObserver(this);
	}
	
	public void update(double value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Observer checked! "+value+" deposit.");
	}

	@Override
	public void update(Observable o, Object arg) {
		update((Double) arg);
	}
}
