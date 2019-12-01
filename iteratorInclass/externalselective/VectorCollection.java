package iteratorInclass.externalselective;

import java.util.Iterator;

public interface VectorCollection {
	public Iterator iterator(Predicate predicate);
	public void add(Integer e);
	
}
