package lab0.subject;

import lab0.ObservableCounter;
import lab0.OperationType;

public interface Subject {
	 public void addObserver(ObservableCounter counter);
	 public void removeObserver(ObservableCounter counter);
	 public void notify(OperationType type);

}
