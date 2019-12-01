package iteratorInclass.externalselective;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyVectorClass extends Vector<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Iterator<Integer> iterator;
	
	
	
	public Iterator iterator(Predicate predicate) {
		iterator = new SelectiveIterator(predicate,this);
		return iterator;
	}

	
	
	

}
