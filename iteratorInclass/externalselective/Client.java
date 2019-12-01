package iteratorInclass.externalselective;

import java.util.Iterator;

public class Client {
	private static MyVectorClass collection;
	public static void main(String[] args) {
		collection = new MyVectorClass();
		for(int i = 1; i < 20; i++)
			collection.add(i);
		
		
		predicate();
	}
	
	
	static void predicate() {
		Predicate predicate = new Predicate() {
			@Override
			public Boolean execute(Integer value) {
				return (value < 15);
			}
		};
		
		Iterator<Integer> iterate = collection.iterator(predicate);
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
			
	}

}
