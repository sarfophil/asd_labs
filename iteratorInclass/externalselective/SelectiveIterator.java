package iteratorInclass.externalselective;

import java.util.Iterator;

public class SelectiveIterator implements Iterator<Integer>{
	
	private MyVectorClass iList;
	private int currentPosition = 0;
	
	
	public SelectiveIterator(Predicate predicate,MyVectorClass vList) {
		iList = vList;
		MyVectorClass tempList = new MyVectorClass();
		for(Integer value : iList) {
			if(predicate.execute(value)) {
				tempList.add(value);	
			}
			
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
