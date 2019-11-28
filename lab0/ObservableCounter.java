package lab0;

public interface ObservableCounter {
	public void observe(TextFrame tf, RectFrame rf, OvalFrame of);
	public void increment();
	public void decrement();
}
