package net.bteryk.designpatterns.observer;

import java.util.List;

public interface Subject {

	List<Observer> registerObserver(Observer observer);

	List<Observer> removeObserver(Observer observer);

	void setTitle(String title);

	void notifyObservers();

}
