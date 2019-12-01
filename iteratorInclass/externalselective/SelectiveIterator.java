package iteratorInclass.externalselective;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class SelectiveIterator implements Iterator<Integer>{
	
	private List<Integer> iList;
	private int currentPosition = 0;
	
	
	
	
	public SelectiveIterator(Predicate predicate,List<Integer> vectorList) {
		this.iList = vectorList;
		List<Integer> tempList = new Vector<>();
		for(Integer value : iList) {
			if(predicate.execute(value))
				tempList.add(value);		
		}
		iList = tempList;
	}
	
	

	@Override
	public boolean hasNext() {
		return (iList.size() > currentPosition);
	}

	@Override
	public Integer next() {
		if(iList.size() > currentPosition) {
			return hasNext()?iList.get(currentPosition++):iList.get(currentPosition);
		}
		return iList.get(currentPosition);
	}
	
	

}
