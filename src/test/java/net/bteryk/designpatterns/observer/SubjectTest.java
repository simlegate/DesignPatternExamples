package net.bteryk.designpatterns.observer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SubjectTest {
	
	@Test
	public void testRegisterObserver() {
		Subject publisher = new Publisher();
		
		Observer subscriber = new Subscriber();
		
		List<Observer> observers = publisher.registerObserver(subscriber);
		
		assertTrue(observers.contains(subscriber));
	}
	
	@Test
	public void testRemoveObserver() {
		Subject publisher = new Publisher();
		
		Observer subscriber = new Subscriber();
		publisher.registerObserver(subscriber);
		
		Observer angrySubscriber = new Subscriber();
		List<Observer> observers = publisher.registerObserver(angrySubscriber);
		
		assertTrue(observers.contains(subscriber));
		assertTrue(observers.contains(angrySubscriber));
		
		observers = publisher.removeObserver(angrySubscriber);
		
		assertTrue(observers.contains(subscriber));
		assertFalse(observers.contains(angrySubscriber));
	}
	
	@Test
	public void testNotifyObservers() {
		Subject publisher = new Publisher();
		
		Observer subscriber = new Subscriber();
		Observer angrySubscriber = new Subscriber();
		
		publisher.registerObserver(subscriber);
		publisher.registerObserver(angrySubscriber);
		
		publisher.setTitle("#11 Fashion Week !");
		
		publisher.notifyObservers();
		
		assertEquals("#11 Fashion Week !", subscriber.getTitle());
		assertEquals("#11 Fashion Week !", angrySubscriber.getTitle());
		
		publisher.setTitle("#12 Fashion Week is every week !");
		publisher.removeObserver(angrySubscriber);
		publisher.notifyObservers();
		
		assertEquals("#12 Fashion Week is every week !", subscriber.getTitle());
		assertEquals("#11 Fashion Week !", angrySubscriber.getTitle());
	}

}
