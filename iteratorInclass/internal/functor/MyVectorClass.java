package iteratorInclass.internal.functor;

import java.util.Vector;


public class MyVectorClass extends Vector<Integer>  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	public Integer sum() {
		Functor<Integer> functor = new SumFunctor();
		Iterator it = new IteratorImpl(this);
		return it.doAll(functor);
	}

	public Integer average() {
		Functor<Integer> functor = new AverageFunctor();
		Iterator it = new IteratorImpl(this);
		return it.doAll(functor);
	}
	
	
	public Integer greaterThanTwo() {
		Functor<Integer> functor = new SelectiveFunctor();
		Iterator it = new IteratorImpl(this);
		return it.doAll(functor);
	}
	
	

	
	
	
	
	

	
	

	

}
