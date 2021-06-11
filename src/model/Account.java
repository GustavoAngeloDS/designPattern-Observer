package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import interfaces.Subject;

public class Account implements Subject{

	private Long id;
	private double balance;
	
	private List<Observer> observers;
	
	public Account(Long id, double balance){
		this.id = id;
		this.balance = balance;
		
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		observers.remove(i);
	}
	
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(null, this.getBalance());
		}
	}
	
	public void setValue(double value) {
		this.setBalance(value);
		notifyObservers();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
}
