package memoization.demo;

public class AdditionImpl implements Foo<String,String>{

	@Override
	public String compute(String x) {
		return x+" processed";
	}

	

}
