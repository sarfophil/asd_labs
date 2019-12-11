package memoization.demo;

public class MultiImpl implements Foo<Integer,Integer>{

	@Override
	public Integer compute(Integer x) {
		return (2*x); 
	}

	

}
