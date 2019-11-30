package lab2.iterator;

import lab2.dto.Swimmer;

public interface Iterator {
	public Swimmer first();
	public Swimmer next();
	public boolean isDone();
	public Swimmer currentItem();
	public void add(Swimmer swimmer);
	public void remove(Swimmer swimmer);
}
