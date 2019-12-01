/**
 * 
 */
package iteratorInclass.externaljava;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author SARFO PHILIP
 *
 */
public class MyVector {


	private static List<Integer> vectorList = new Vector<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
			vectorList.add(i);
		
		externalIterate();

	}
	
	static void externalIterate() {
		Iterator iterator = vectorList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator);
		
	}

}
