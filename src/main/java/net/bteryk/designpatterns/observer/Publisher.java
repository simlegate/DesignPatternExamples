package net.bteryk.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String title = "";
	
	public List<Observer> registerObserver(Observer observer) {
		observers.add(observer);
		
		return observers;
	}

	public List<Observer> removeObserver(Observer observer) {
		observers.remove(observer);
		
		return observers;
	}

	public void setTitle(String title) {
		this.title = title;		
	}

	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this.title);
		}
	}

}
