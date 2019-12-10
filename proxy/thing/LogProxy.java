package proxy.thing;

import proxy.wrapperfunctor.LogFunctor;
import proxy.wrapperfunctor.Proxy;

public class LogProxy<T> implements Thing<T>{
	
	private Thing<T> thing;
	private LogFunctor<T> log;
	
	public LogProxy(Thing<T> thing) {
		this.thing = thing;
		log = new Proxy<>();
	}

	@Override
	public void compute(T value) {
		log.pre(value);
		thing.compute(value);
		log.post(value);
	}

}
