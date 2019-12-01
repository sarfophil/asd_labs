package iteratorInclass.externalselective;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyVectorClass implements VectorCollection{
	
	private Iterator<Integer> iterator;
	private List<Integer> iList = new Vector<Integer>();
	
	
	
	@SuppressWarnings("rawtypes") 
	@Override
	public Iterator iterator(Predicate predicate) {
		iterator = new SelectiveIterator(predicate,iList);
		return iterator;
	}

	@Override
	public void add(Integer e) {
			iList.add(e);
	}
	
	
	

}
