/**
 * 
 */
package lab2.swimmer;

import lab2.dto.SearchType;
import lab2.dto.Swimmer;
import lab2.iterator.Iterator;

/**
 * @author SARFO PHILIP
 *
 */
public interface SwimmerList {

	void doList(SearchType searchType);

	void addSwimmer(Swimmer swimmer);

	Iterator getIterator();

}
