package observablepkge.observer;

import observablepkge.subject.Subject;

public class ConcreteObserver implements ObserverI{

	@Override
	public void update(Subject subject) {
		System.out.println(
				subject.getState());
	}

}
