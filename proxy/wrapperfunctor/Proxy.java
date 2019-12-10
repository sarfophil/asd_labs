package proxy.wrapperfunctor;

public class Proxy<T> implements LogFunctor<T>{

	@Override
	public void pre(T value) {
		System.out.println("Pre: value: "+value);
	}

	@Override
	public void post(T value) {
		System.out.println("Post: value: "+value);
	}


	

}
