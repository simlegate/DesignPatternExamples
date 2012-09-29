/**
 * 
 */
package net.bteryk.designpatterns.observer;

/**
 * @author Galephico
 *
 */
public class Subscriber implements Observer {

	private String title;
	
	/* (non-Javadoc)
	 * @see net.bteryk.designpatterns.observer.Observer#update(java.lang.String)
	 */
	public void update(String title) {
		this.title = title;

	}

	public String getTitle() {
		return this.title;
	}

}
