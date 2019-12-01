package iteratorInclass.internal.functor;

public class IteratorImpl implements Iterator{
	
	MyVectorClass vectorList;
	
	public <T> IteratorImpl(MyVectorClass myVectorClass) {
		vectorList =  myVectorClass;
	}

	

	@Override
	public Integer doAll(Functor<Integer> functor) {
		for(Integer element : vectorList) {
			functor.compute(element);
		}
		return functor.getValue();
	}

}
