/**
 * 
 */
package lab2.iterator;

import java.util.List;

import lab2.dto.Swimmer;

/**
 * @author SARFO PHILIP
 *
 */
public class AllSwimmingImpl implements Iterator{
	private List<Swimmer> swimmingList;
	private int currentPos = 0;
	
	public AllSwimmingImpl(List<Swimmer> swimmingList) {
		this.swimmingList = swimmingList;
	}

	

	@Override
	public boolean isDone() {
		return (swimmingList.size() == currentPos);
	}

	@Override
	public Swimmer currentItem() {
		System.out.println(currentPos);
		return swimmingList.get(currentPos);
	}

	@Override
	public void add(Swimmer swimmer) {
		swimmingList.add(swimmer);
		
	}

	@Override
	public void remove(Swimmer swimmer) {
		swimmingList.remove(swimmer);	
	}



	@Override
	public Swimmer first() {
		return swimmingList.get(0);
	}



	@Override
	public Swimmer next() {
		if(swimmingList.size()-1 > currentPos) {
			Swimmer nextSwimmer = swimmingList.get(currentPos);
			++currentPos;
			return nextSwimmer;
		}
		return null;
	}

}
