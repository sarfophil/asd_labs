/**
 * 
 */
package proxy.thing;

/**
 * @author SARFO PHILIP
 *
 */
public class bThing<T> implements Thing<T>{
	
	private T value;
	
	public bThing(T value) {
		this.value = value;
	}

	@Override
	public void compute(T text) {
		System.out.println(value+" "+text);
	}

}
