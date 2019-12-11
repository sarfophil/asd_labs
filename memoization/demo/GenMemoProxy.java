package memoization.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GenMemoProxy<T,R> implements Foo<T,R>{
	
	private Map<T,R> map = Collections.synchronizedMap(new HashMap<T, R>()); 
	private Foo<T,R> app;
	
	public GenMemoProxy(Foo<T,R> app) {
		this.app = app;
	}

	@Override
	public R compute(T x) {
		R value = map.get(x);
		if(value == null) {
			System.out.println("Compute("+x+")");
			value = app.compute(x);
			map.put(x, value);
		}
		return value;
	}

}
