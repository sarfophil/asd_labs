package proxy.wrapperfunctor;

public interface LogFunctor<T> {
	public void pre(T value);
	public void post(T value);
}
