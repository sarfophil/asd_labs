package proxy.thing;

public class aThing<T> implements Thing<T>{
	
	private T value;
	
	public aThing(T value) {
		this.value = value;
	}

	@Override
	public void compute(T text) {
		System.out.println(value+" "+text);
	}

}
