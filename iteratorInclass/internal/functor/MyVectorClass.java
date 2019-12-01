package iteratorInclass.internal.functor;

import java.util.List;
import java.util.Vector;

public class MyVectorClass implements Iterator {
	
	private List<Integer> data = new Vector<>();
	
	public static void main(String[] args) {
		Iterator it = new MyVectorClass();
		System.out.println("Total :"+it.sum());
		System.out.println("Average:"+it.average());
		
	}
	
	public MyVectorClass() {
		for(int i = 1; i<=10; i++) {
			data.add(i*90);
		}
	}

	@Override
	public Integer sum() {
		Functor<List<Integer>> functor = new SumFunctor();
		return functor.doAll(data);
	}

	@Override
	public Integer average() {
		Functor<List<Integer>> functor = new AverageFunctor();
		return functor.doAll(data);
	}
	
	
	//

	
	
	
	
	

	
	

	

}
