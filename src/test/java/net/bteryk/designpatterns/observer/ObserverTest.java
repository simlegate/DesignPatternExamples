package net.bteryk.designpatterns.observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {
	
	@Test
	public void testObserverUpdate() {
		Observer observer = new Subscriber();
		
		observer.update("#11 Fashion Week !");
		assertEquals("#11 Fashion Week !", observer.getTitle());
		
		observer.update("#12 Fashion Week is every week !");
		assertEquals("#12 Fashion Week is every week !", observer.getTitle());
		
		
	}

}
