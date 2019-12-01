package iteratorInclass.internal.functor;

import java.util.List;

public class AverageFunctor implements Functor<List<Integer>>{

	private int count = 0;
	private int total = 0;
	private int average = 0;
	
	@Override
	public void compute(List<Integer> value) {
		for(Integer num : value) {
			count++;
			total += num;
		}
		average = total / count;
	}
	
	@Override
	public int getValue() {
		return average;
	}

	@Override
	public int doAll(List<Integer> list) {
		compute(list);
		return getValue();
	}
	
	
	
	
	
	

}
