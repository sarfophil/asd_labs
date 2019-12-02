/**
 * 
 */
package lab3work;

import java.util.List;

/**
 * @author SARFO PHILIP
 *
 */
public class Components implements Cabinet{
	
	private List<Cabinet> cabinets;
	private double totalPrice = 0.0;
	
	public Components(List<Cabinet> cabinetList) {
		cabinets = cabinetList;
	}

	@Override
	public double computePrice() {
		for(Cabinet cabinet : cabinets)
			totalPrice += cabinet.computePrice();
		return totalPrice;
	}

}
