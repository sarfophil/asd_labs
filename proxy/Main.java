package proxy;

import proxy.thing.LogProxy;
import proxy.thing.Thing;
import proxy.thing.aThing;
import proxy.thing.bThing;

public class Main {
	
	public static void main(String[] args) {
		Thing<String> athing = new aThing<>("A");
		athing.compute("Hello");
		
		Thing<String> aProxy = new LogProxy<String>(athing);
		aProxy.compute("Hello");
		
		Thing<String> bthing = new bThing<>("B");
		bthing.compute("Hello");
		
		Thing<String> bProxy = new LogProxy<String>(bthing);
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
