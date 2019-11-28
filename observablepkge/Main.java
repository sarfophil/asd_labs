package observablepkge;

import observablepkge.observer.ConcreteObserver;
import observablepkge.subject.ConcreteSubject;
import observablepkge.subject.Subject;

public class Main {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		
		
		for(int i = 0; i < 10; i++) {
			subject.setState("Philip "+i);
			subject.attach(String.valueOf(i), new ConcreteObserver());
		}

	}

}
