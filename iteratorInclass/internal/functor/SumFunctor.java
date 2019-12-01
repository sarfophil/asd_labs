package iteratorInclass.internal.functor;


public class SumFunctor implements Functor<Integer>{
	
	private int total = 0;
	
	

	@Override
	public int getValue() {
		return total;
	}

	@Override
	public void compute(Integer value) {
		total += (int) value;
	}

	

	

}
