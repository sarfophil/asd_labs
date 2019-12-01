package iteratorInclass.internal.functor;

import java.util.List;

public class SumFunctor implements Functor<List<Integer>>{
	
	private int total = 0;

	@Override
	public void compute(List<Integer> value) {
		for(Integer num : value) {
			total += num;
		}
	}

	@Override
	public int getValue() {
		return total;
	}

	@Override
	public int doAll(List<Integer> list) {
		compute(list);
		return getValue();
	}

	

}
