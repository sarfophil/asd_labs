package lab0.subject;

import java.util.ArrayList;
import java.util.List;

import lab0.ObservableCounter;
import lab0.OperationType;


public class ConcreteSubject implements Subject{
	private List<ObservableCounter> observableList = new ArrayList<ObservableCounter>();

	@Override
	public void addObserver(ObservableCounter counter) {
		observableList.add(counter);
		
	}

	@Override
	public void removeObserver(ObservableCounter counter) {
		observableList.remove(counter);
		
	}

	@Override
	public void notify(OperationType type) {
		observableList.forEach(ob->{
			ob.update(type);
		});
		
	}
}
