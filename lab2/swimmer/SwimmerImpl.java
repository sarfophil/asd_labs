package lab2.swimmer;

import java.util.ArrayList;
import java.util.List;

import lab2.dto.SearchType;
import lab2.dto.Swimmer;
import lab2.iterator.Above12Impl;
import lab2.iterator.AllSwimmingImpl;
import lab2.iterator.BackwardImpl;
import lab2.iterator.Iterator;

public class SwimmerImpl implements SwimmerList{
	
	private List<Swimmer> swimmerList = new ArrayList<Swimmer>();
	private Iterator iterator;
	
	@Override
	public void doList(SearchType searchType) {
		switch(searchType) {
		case ALLSWIMMERS:
			iterator = new AllSwimmingImpl(swimmerList);
			break;
		case ALLABOVE12:
			iterator = new Above12Impl(swimmerList);
			break;
		case ALLBACKWARD:
			iterator = new BackwardImpl(swimmerList);
			break;
		}
	}
	
	@Override
	 public void addSwimmer(Swimmer swimmer){
	      iterator.add(swimmer);
	 }
	 
	@Override
	 public Iterator getIterator() {
		 return iterator;
	 }

}
