package iteratorInclass.internal.functor;

public class SelectiveFunctor implements Functor<Integer>{

	private int total = 0;
	
	
	@Override
	public int getValue() {
		return total;
	}

	@Override
	public void compute(Integer value) {
		if(value > 2)
			total += (int) value;	
	}

}
