package lab2.iterator;

import java.util.List;
import java.util.stream.Collectors;

import lab2.dto.Swimmer;

public class Above12Impl implements Iterator{
	
	private List<Swimmer> swimmingList;
	private int currentPos = 0;
	
	public Above12Impl(List<Swimmer> swimmingList) {
		this.swimmingList = swimmingList.stream()
				.filter(s->s.getAge()>=12)
				.collect(Collectors.toList());;
	}

	@Override
	public Swimmer first() {
		return swimmingList.get(0);
	}

	@Override
	public Swimmer next() {
		if(swimmingList.size()-1 > currentPos) {
			Swimmer nextSwimmer = swimmingList.get(currentPos);
			currentPos++;
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
