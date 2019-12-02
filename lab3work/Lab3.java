/**
 * 
 */
package lab3work;

import java.util.ArrayList;
import java.util.List;



/**
 * @author SARFO PHILIP
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Components
		List<Cabinet> cabinet = new ArrayList<Cabinet>();
		
		cabinet.add(new Board());
		cabinet.add(new Drive());
		cabinet.add(new Drive());
		cabinet.add(new Drive());
		
		cabinet.add(new Bus());
		
		cabinet.add(new Card());
		cabinet.add(new Card());
		cabinet.add(new Card());
		
		Cabinet cab = new Components(cabinet);
		
		 System.out.println("Total price of computer is: "+ cab.computePrice());

	}

}
