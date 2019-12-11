package proxy;

import proxy.thing.LogProxy;
import proxy.thing.Thing;
import proxy.thing.aThing;
import proxy.thing.bThing;
import proxy.wrapperfunctor.LogFunctor;
import proxy.wrapperfunctor.Proxy;

public class Main {
	
	public static void main(String[] args) {
		Thing<String> athing = new aThing<>("A");
		athing.compute("Hello");
		
		LogFunctor<String> functor = new Proxy<>();
		
		Thing<String> aProxy = new LogProxy<String>(athing,functor);
		aProxy.compute("Hello");
		
		Thing<String> bthing = new bThing<>("B");
		bthing.compute("Hello");
		
		Thing<String> bProxy = new LogProxy<String>(bthing,functor);
		bProxy.compute("Hello");
		
		//Output
		
//		A Hello
//		Pre: value: Hello
//		A Hello
//		Post: value: Hello
//		B Hello
//		Pre: value: Hello
//		B Hello
//		Post: value: Hello
	}

}
