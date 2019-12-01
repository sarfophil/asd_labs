/**
 * 
 */
package iteratorInclass.internal.functor;

/**
 * @author SARFO PHILIP
 *
 */
public interface Functor<T> {	
	public void compute(T value);
	public int getValue();
	public int doAll(T list);
}
