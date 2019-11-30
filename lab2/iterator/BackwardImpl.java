package lab2.iterator;

import java.util.ArrayList;
import java.util.List;

import lab2.dto.Swimmer;

public class BackwardImpl implements Iterator{

	private List<Swimmer> swimmingList;
	private int currentPos = 0;
	
	
	public BackwardImpl(List<Swimmer> swimmingList) {
		this.swimmingList = swimmingList;
		backwardList();
	}

	@Override
	public Swimmer first() {
		return swimmingList.get(0);
	}
	
	private void backwardList() {
		List<Swimmer> swimList = new ArrayList<Swimmer>();
		for(int i = swimmingList.size()-1; i >= 0; i--)
			swimList.add(swimmingList.get(i));
		swimmingList = swimList;
	}

	@Override
	public Swimmer next() {
		if(swimmingList.size()-1 > currentPos) {
			Swimmer nextSwimmer = swimmingList.get(currentPos);
			++ currentPos;
			return nextSwimmer;
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return (swimmingList.size() == currentPos);
	}

	@Override
	public Swimmer currentItem() {
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

	

}
