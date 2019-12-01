/**
 * 
 */
package iteratorInclass.internal.functor;

/**
 * @author SARFO PHILIP
 *
 */
@SuppressWarnings("hiding")
public interface Functor<Integer> {	
	public void compute(Integer value);
	public int getValue();
}
