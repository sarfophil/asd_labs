package proxy.thing;

import proxy.wrapperfunctor.LogFunctor;

public class LogProxy<T> implements Thing<T>{
	
	private Thing<T> thing;
	private LogFunctor<T> log;
	
	public LogProxy(Thing<T> thing,LogFunctor<T> log) {
		this.thing = thing;
		this.log = log;
	}

	@Override
	public void compute(T value) {
		log.pre(value);
		thing.compute(value);
		log.post(value);
	}

}
