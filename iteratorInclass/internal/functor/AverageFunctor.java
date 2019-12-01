package iteratorInclass.internal.functor;

public class AverageFunctor implements Functor<Integer>{

	private int count = 0;
	private int total = 0;
	private int average = 0;
	
	
	
	@Override
	public void compute(Integer value) {
		count++;
		total += value;
		average = total / count;
	}
	
	@Override
	public int getValue() {
		return average;
	}


}
