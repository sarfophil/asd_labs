package iteratorInclass.internal.functor;

import java.util.List;

public class SelectiveFunctor implements Functor<List<Integer>>{

	private int total = 0;

	@Override
	public void compute(List<Integer> valueList) {
		for(Integer num : valueList)
			if(num > 2)
				total += num;
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
