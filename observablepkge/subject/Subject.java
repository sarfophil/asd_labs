package observablepkge.subject;

import java.util.HashMap;

import observablepkge.observer.ObserverI;

public interface Subject {
	HashMap<String, ObserverI> observableList = new HashMap<String, ObserverI>();
	
	
	default void attach(String eventName,ObserverI observer) {
		observableList.put(eventName, observer);
		
		Notify();
	}
	
	default void detach(String eventName) {
		observableList.remove(eventName);
	}
	
	default void Notify() {
		observableList.forEach((k,s)->{
			 s.update(this);
		});
	}

	String getState();

	void setState(String state);
	
	
	
	
}
